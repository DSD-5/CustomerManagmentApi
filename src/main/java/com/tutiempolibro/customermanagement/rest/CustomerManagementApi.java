package com.tutiempolibro.customermanagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tutiempolibro.customermanagement.model.Persona;
import com.tutiempolibro.customermanagement.service.ICustomerManagementService;

@RequestMapping("/customermanagement")
@RestController
public class CustomerManagementApi {

	@Autowired
	private ICustomerManagementService customerManagementService;

	@PostMapping(value = "/registerClient", produces = { "application/json" })
	public Persona registrarCliente(@RequestBody Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.registrarCliente(persona);
	}

	@PostMapping(value = "/updateClient", produces = { "application/json" })
	public Persona actualizarCliente(@RequestBody Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.actualizarCliente(persona);
	}
	
	@GetMapping(value = "/client/{idpersona}", produces = { "application/json" })
	public Persona obtenerCliente(@PathVariable (value ="idpersona") Integer idpersona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.obtenerCliente(idpersona);
	}

}
