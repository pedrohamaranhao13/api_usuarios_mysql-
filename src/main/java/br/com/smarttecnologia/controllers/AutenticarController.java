package br.com.smarttecnologia.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping(value = "/api/autenticar")
public class AutenticarController {
	
	@PostMapping()
	public void post() {
		// TODO
	}

}
