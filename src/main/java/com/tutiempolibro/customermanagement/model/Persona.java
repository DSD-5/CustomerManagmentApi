package com.tutiempolibro.customermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Entity(name = "persona")
@Data
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpersona;

	private String nombres;

	private String apepat;
	private String apemat;
	@Column(unique = true)
	private String email;
	private String numdoc;
	private String tipodoc;
	private String estado;
	private String departamento;
	private String provincia;
	private String distrito;
	private String ubigueo;
	
	@Transient
	private String usuario;
	
	@Transient
	private String codcliente;
	
	@Transient
	private String password;
}
