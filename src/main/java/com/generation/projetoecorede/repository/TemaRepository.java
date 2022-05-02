package com.generation.projetoecorede.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.projetoecorede.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository <Tema, Long> {
	
		
		public List <Tema> findAllByTopicoContainingIgnoreCase(@Param("topico") String topico);
		
		boolean existsById(Long id);
}
