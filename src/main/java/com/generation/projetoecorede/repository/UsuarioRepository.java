package com.generation.projetoecorede.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.projetoecorede.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	
	public List <Usuario> findAllByUsuarioContainingIgnoreCase(@Param("usuario") String usuario);
	
	boolean existsById(Long id);
	}