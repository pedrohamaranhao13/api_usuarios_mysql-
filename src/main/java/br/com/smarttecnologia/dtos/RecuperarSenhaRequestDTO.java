package br.com.smarttecnologia.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecuperarSenhaRequestDTO {

	@Email(message = "Por favor, informe um endereço de e-mail válido")
	@NotBlank(message = "Por vafor, informe o e-mail do usuário.")
	private String email;
	
}
