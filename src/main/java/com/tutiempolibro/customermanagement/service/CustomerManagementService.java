package com.tutiempolibro.customermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.customermanagement.business.CustomerManagementBusiness;
import com.tutiempolibro.customermanagement.model.Persona;

@Service
public class CustomerManagementService implements ICustomerManagementService {
	
	@Autowired
	private CustomerManagementBusiness customerManagementBusiness;
	
	@Override
	public Persona registrarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementBusiness.registrarCliente(persona);
	}

	@Override
	public Persona actualizarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementBusiness.actualizarCliente(persona);
	}

	@Override
	public Persona obtenerCliente(Integer idpersona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementBusiness.obtenerCliente(idpersona);
	}

	
}
