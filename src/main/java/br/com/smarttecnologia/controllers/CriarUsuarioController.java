package br.com.smarttecnologia.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.smarttecnologia.dtos.CriarUsuarioRequestDTO;
import br.com.smarttecnologia.dtos.CriarUsuarioResponseDTO;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/criar-usuario")
public class CriarUsuarioController {
	
	@PostMapping()
	public ResponseEntity<CriarUsuarioResponseDTO> post(@RequestBody @Valid CriarUsuarioRequestDTO dto) {	
		
		try {
			return null;
		} catch (Exception e) {
			return ResponseEntity.status(500).body(null);
		}
		
	}

}
