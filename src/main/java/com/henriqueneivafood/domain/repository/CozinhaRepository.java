package com.henriqueneivafood.domain.repository;

import java.util.List;

import com.henriqueneivafood.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> todas();

	Cozinha porId(long id);

	Cozinha adicionar(Cozinha cozinha);

	void remover(Cozinha cozinha);

}
