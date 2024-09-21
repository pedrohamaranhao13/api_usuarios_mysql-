package br.com.smarttecnologia.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.smarttecnologia.dtos.AutenticarRequestDTO;
import br.com.smarttecnologia.dtos.AutenticarResponseDTO;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/api/autenticar")
public class AutenticarController {
	
	@PostMapping()
	public ResponseEntity<AutenticarResponseDTO> post(@RequestBody @Valid AutenticarRequestDTO dto) {
		return null;
	}

}
