package com.usuario.openapi.controller;

import java.util.Collection;
import java.util.List;

import com.usuario.dto.PermissaoModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@SecurityRequirement(name = "security_auth")
@Tag(name = "Permissões")
public interface PermissaoControllerOpenApi {

	@Operation(summary = "Lista as permissões")
	Collection<PermissaoModel> listar();

}
