package com.tutiempolibro.customermanagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="carrito_tmp")
@Data
public class Carrito implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idcarrito;
	    
	    private Integer idcliente;
	    
	    private String estado;
	    
	    private Date fecha;
	    
	    private Double total;
	    
	    private Integer iddelivery;
	    
	    private Double costodelivery;
	    
	    private Double subtotalventa;
	    
	    private Double subtotalalquiler;
	    
	    private Double descuentoventa;
	    
	    private Double descuentoalquiler;
	    
	    private Date fechaactualizacion;
}
