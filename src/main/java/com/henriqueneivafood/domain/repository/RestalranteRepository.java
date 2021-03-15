package com.henriqueneivafood.domain.repository;

import java.util.List;

import com.henriqueneivafood.domain.model.Restalrante;

public interface RestalranteRepository {
	
	List<Restalrante> todas();

	Restalrante porId(long id);

	Restalrante adicionar(Restalrante restalrante);

	void remover(Restalrante restalrante);
	
}
