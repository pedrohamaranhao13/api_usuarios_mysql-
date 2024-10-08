package br.com.smarttecnologia.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.smarttecnologia.dtos.RecuperarSenhaRequestDTO;
import br.com.smarttecnologia.dtos.RecuperarSenhaResponseDTO;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/recuperar-senha")
public class RecuperarSenhaController {
	
	@PostMapping()
	public ResponseEntity<RecuperarSenhaResponseDTO> post(@RequestBody @Valid RecuperarSenhaRequestDTO dto) {	
		return null;
	}

}
