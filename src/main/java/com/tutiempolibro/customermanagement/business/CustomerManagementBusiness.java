package com.tutiempolibro.customermanagement.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tutiempolibro.customermanagement.clients.ClientesFeign;
import com.tutiempolibro.customermanagement.commons.Util;
import com.tutiempolibro.customermanagement.model.Cliente;
import com.tutiempolibro.customermanagement.model.Persona;
import com.tutiempolibro.customermanagement.model.Rol;
import com.tutiempolibro.customermanagement.model.Usuario;
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

	public Persona registrarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		persona = personaRepo.save(persona);

		Cliente cliente = new Cliente();
		cliente.setIdcliente(persona.getIdpersona());
		cliente.setEstado("1");
		cliente.setFecharegistro(new Date());
		cliente.setCodcliente(Util.generateCodCliente(persona.getIdpersona() + ""));
		clienteRepo.save(cliente);
		persona.setCodcliente(cliente.getCodcliente());

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

		return persona;
	}

	public Persona actualizarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return personaRepo.save(persona);
	}
	
	public Persona obtenerCliente(Integer idpersona) throws Exception{
		return personaRepo.findById(idpersona).orElse(new Persona());
	}

}
