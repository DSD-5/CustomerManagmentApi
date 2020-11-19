package com.tutiempolibro.customermanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="cliente")
@Data
public class Cliente {
	
	@Id
	private Integer idcliente;
	private String estado;
	private Date fecharegistro;
	
	@Column(unique = true)
	private String codcliente;
	
}
