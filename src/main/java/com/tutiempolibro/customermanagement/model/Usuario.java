package com.tutiempolibro.customermanagement.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity(name="usuario")
@Data
public class Usuario implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    
    private String usuario;
    
    private String password;
    
    private Integer idpersona;
    
    private String estado;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "detalle_usuario_perfil", joinColumns = @JoinColumn(name = "idusuario"), inverseJoinColumns = @JoinColumn(name = "idperfil"))
    private List<Rol> roles;
    
}
