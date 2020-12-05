package com.tutiempolibro.customermanagement.business;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tutiempolibro.customermanagement.commons.Enum;
import com.tutiempolibro.customermanagement.model.Suscripcion;
import com.tutiempolibro.customermanagement.repository.SuscripcionRepository;

@Service
public class SuscriptionManagementBusiness {

	@Autowired
	private SuscripcionRepository suscripcionRepo;

	public Suscripcion registrarSuscripcion(Integer idcliente, String plan) {
		Suscripcion suscripcion = new Suscripcion();
		suscripcion.setEstado("1");
		suscripcion.setIdcliente(idcliente);
		suscripcion.setIdplan(retornarIdPlan(plan));
		suscripcion.setFechainicio(new Date());
		suscripcion.setFechafin(retornarFechaFinSus(suscripcion.getFechainicio()));
		return suscripcionRepo.save(suscripcion);
	}

	private Date retornarFechaFinSus(Date fechainicio) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.setTime(fechainicio);
		c.add(Calendar.YEAR, 1);
		return c.getTime();

	}

	private Integer retornarIdPlan(String plan) {
		// TODO Auto-generated method stub
		return Enum.fromValue(plan).anotherValue;
	}
	
	public Suscripcion retornarSuscripcion(Integer idPersona) {
		List<Suscripcion> suscripciones = suscripcionRepo.findByIdcliente(idPersona);
		suscripciones.stream().filter(s -> s.getEstado().equals("1"));
		return suscripciones.get(0);
	}

}
