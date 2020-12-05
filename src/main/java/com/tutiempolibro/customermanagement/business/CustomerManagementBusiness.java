package com.tutiempolibro.customermanagement.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tutiempolibro.customermanagement.clients.ClientesFeign;
import com.tutiempolibro.customermanagement.commons.Constant;
import com.tutiempolibro.customermanagement.commons.Util;
import com.tutiempolibro.customermanagement.model.Carrito;
import com.tutiempolibro.customermanagement.model.Cliente;
import com.tutiempolibro.customermanagement.model.Persona;
import com.tutiempolibro.customermanagement.model.Rol;
import com.tutiempolibro.customermanagement.model.Usuario;
import com.tutiempolibro.customermanagement.producer.SendEmail;
import com.tutiempolibro.customermanagement.producer.service.CustomerProducer;
import com.tutiempolibro.customermanagement.repository.CarritoRepository;
import com.tutiempolibro.customermanagement.repository.ClienteRepository;
import com.tutiempolibro.customermanagement.repository.PersonaRepository;

@Service
public class CustomerManagementBusiness {

	@Autowired
	private ClienteRepository clienteRepo;

	@Autowired
	private PersonaRepository personaRepo;

	@Autowired
	private ClientesFeign clientesFeign;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private SuscriptionManagementBusiness suscriptionManagementBusiness;

	@Autowired
	private CustomerProducer customerProducer;
	
	@Autowired
	private CarritoRepository carritoRepo;

	public Persona registrarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		persona = personaRepo.save(persona);

		Cliente cliente = new Cliente();
		cliente.setIdcliente(persona.getIdpersona());
		cliente.setEstado("1");
		cliente.setFecharegistro(new Date());
		cliente.setCodcliente(Util.generateCodCliente(persona.getIdpersona() + ""));
		persona.setCodcliente(clienteRepo.save(cliente).getCodcliente());

		persona.setIdsuscripcion(suscriptionManagementBusiness
				.registrarSuscripcion(persona.getIdpersona(), Constant.PLAN_FREE).getIdsuscripcion());

		Usuario usuario = new Usuario();
		usuario.setEstado("1");
		usuario.setIdpersona(persona.getIdpersona());
		usuario.setUsuario(persona.getUsuario());
		usuario.setPassword(passwordEncoder.encode(persona.getPassword().trim()));
		List<Rol> roles = new ArrayList<Rol>();
		Rol rol = new Rol();
		rol.setIdperfil(2);
		rol.setDescripcion("ROLE_USER");
		roles.add(rol);
		usuario.setRoles(roles);
		clientesFeign.guardarUsuario(usuario);

		enviarMensajeKafka(persona);

		return persona;
	}

	private void enviarMensajeKafka(Persona persona) throws JsonProcessingException {
		SendEmail send = new SendEmail();
		send.setIdpersona(persona.getIdpersona());
		com.tutiempolibro.customermanagement.producer.Usuario usuario = new com.tutiempolibro.customermanagement.producer.Usuario();
		usuario.setUsuario(persona.getUsuario());
		usuario.setPassword(persona.getPassword());
		send.setUsuario(usuario);
		customerProducer.sendMessage(send);
	}

	public Persona actualizarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return personaRepo.save(persona);
	}

	public Persona obtenerCliente(Integer idpersona) throws Exception {
		Persona persona = personaRepo.findById(idpersona).orElse(new Persona());
		persona.setIdsuscripcion(suscriptionManagementBusiness.retornarSuscripcion(idpersona).getIdsuscripcion());
		
		List<Carrito> listCarritos = carritoRepo.findByIdclienteAndEstado(idpersona, "P");
		
		if(listCarritos!=null && listCarritos.size()>0)
			persona.setShoppingid(listCarritos.get(0).getIdcarrito());
		
		return persona;
	}

}
