package com.usuario.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PermissaoModel {

	@Schema(example = "1")
	private Long id;

	@Schema(example = "CONSULTAR")
	private String nome;

	@Schema(example = "Permite consultar")
	private String descricao;	
}