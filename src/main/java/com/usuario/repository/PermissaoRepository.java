package com.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.domain.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
