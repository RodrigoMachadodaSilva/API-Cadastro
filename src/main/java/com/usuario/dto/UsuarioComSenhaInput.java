package com.usuario.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioComSenhaInput extends UsuarioInput {

	
	@NotBlank
	private String senha;
	
}
