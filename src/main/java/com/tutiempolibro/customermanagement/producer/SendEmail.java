package com.tutiempolibro.customermanagement.producer;

import java.io.Serializable;

import lombok.Data;

@Data
public class SendEmail implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idpersona;
	private String correo;
	private String tipocorreo;
	private Usuario usuario;
	
	private boolean envio;
	
	
}
