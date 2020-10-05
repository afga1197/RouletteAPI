package com.RouletteAPI.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RouletteAPI.model.Client;
import com.RouletteAPI.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Client client){
		if(clientService.saveClient(client)) {
			return new ResponseEntity("Se registro el cliente", HttpStatus.OK);
		}else {
			return new ResponseEntity("no se pudo registrar el cliente",HttpStatus.BAD_REQUEST);
		}
	}
}