package com.tutiempolibro.customermanagement.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tutiempolibro.customermanagement.model.Usuario;

@FeignClient(name="service-user")
public interface ClientesFeign {

	@PostMapping("/usuarios")
	public Usuario guardarUsuario(@RequestBody Usuario usuario);

}
