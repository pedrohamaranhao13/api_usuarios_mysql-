package br.com.smarttecnologia.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
public class AutenticarRequestDTO {

	@Email(message = "Por favor, informe um endereço de e-mail válido")
	@NotBlank(message = "Por vafor, informe o e-mail do usuário.")
	private String email;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
				message = "Por favor, informe uma senha com números, com letras maiúsculas e minúsculas, símbolos e no mínimo 8 caracteres")
	@NotBlank(message = "Por vafor, informe a senha do usuário.")
	private String senha;
}
