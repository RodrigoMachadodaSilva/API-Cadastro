package com.usuario.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.assembler.GrupoModelAssembler;
import com.usuario.disassembler.GrupoInputDisassembler;
import com.usuario.domain.entity.Grupo;
import com.usuario.dto.GrupoInput;
import com.usuario.dto.GrupoModel;
import com.usuario.openapi.controller.GrupoControllerOpenApi;
import com.usuario.repository.GrupoRepository;
import com.usuario.service.GrupoService;

@RestController
@RequestMapping("/grupos")
public class GrupoController implements GrupoControllerOpenApi {

    @Autowired
    private GrupoRepository grupoRepository;
    
    @Autowired
    private GrupoService cadastroGrupo;
    
    @Autowired
    private GrupoModelAssembler grupoModelAssembler;
    
    @Autowired
    private GrupoInputDisassembler grupoInputDisassembler;
    
    @GetMapping
    public List<GrupoModel> listar() {
        List<Grupo> todosGrupos = grupoRepository.findAll();
        
        return grupoModelAssembler.toCollectionModel(todosGrupos);
    }
    
    @GetMapping("/{grupoId}")
    public GrupoModel buscar(@PathVariable Long grupoId) {
        Grupo grupo = cadastroGrupo.buscarOuFalhar(grupoId);
        
        return grupoModelAssembler.toModel(grupo);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GrupoModel adicionar(@RequestBody @Valid GrupoInput grupoInput) {
        Grupo grupo = grupoInputDisassembler.toDomainObject(grupoInput);
        
        grupo = cadastroGrupo.salvar(grupo);
        
        return grupoModelAssembler.toModel(grupo);
    }
    
    @PutMapping("/{grupoId}")
    public GrupoModel atualizar(@PathVariable Long grupoId,
            @RequestBody @Valid GrupoInput grupoInput) {
        Grupo grupoAtual = cadastroGrupo.buscarOuFalhar(grupoId);
        
        grupoInputDisassembler.copyToDomainObject(grupoInput, grupoAtual);
        
        grupoAtual = cadastroGrupo.salvar(grupoAtual);
        
        return grupoModelAssembler.toModel(grupoAtual);
    }
    
    @DeleteMapping("/{grupoId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long grupoId) {
        cadastroGrupo.excluir(grupoId);	
    }   
} 
