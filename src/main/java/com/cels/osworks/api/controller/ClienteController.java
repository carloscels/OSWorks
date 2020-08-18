package com.cels.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cels.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("joão");
		cliente1.setEmail("goão@email.com");
		cliente1.setTelefone("(16) 9999-99999");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("vitor");
		cliente2.setEmail("vitor@email.com");
		cliente2.setTelefone("(16) 0000-00000");
		
		return Arrays.asList(cliente1, cliente2);
	};

}
