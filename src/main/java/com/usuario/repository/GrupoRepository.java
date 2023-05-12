package com.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.domain.entity.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Long> {

}
