package com.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.assembler.PermissaoModelAssembler;
import com.usuario.domain.entity.Permissao;
import com.usuario.dto.PermissaoModel;
import com.usuario.openapi.controller.PermissaoControllerOpenApi;
import com.usuario.repository.PermissaoRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/permissoes")
public class PermissaoController implements PermissaoControllerOpenApi {

	@Autowired
	private PermissaoRepository permissaoRepository;
	
	@Autowired
	private PermissaoModelAssembler permissaoModelAssembler;
	

	@GetMapping
	public List<PermissaoModel> listar() {
		List<Permissao> todasPermissoes = permissaoRepository.findAll();
		
		return permissaoModelAssembler.toCollectionModel(todasPermissoes);
	}
	
}
