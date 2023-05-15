package com.usuario.dto;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

import com.usuario.domain.entity.Grupo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioModel {

	private Long id;

	private String nome;

	private String email;

	private String senha;

	private OffsetDateTime dataCadastro;

	private Set<Grupo> grupos = new HashSet<>();

}
