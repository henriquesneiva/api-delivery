package com.henriqueneivafood.domain.repository;

import java.util.List;

import com.henriqueneivafood.domain.model.Cidade;

public interface CidadeRepositoy {

	List<Cidade> todas();

	Cidade porId(long id);

	Cidade adicionar(Cidade cidade);

	void remover(Cidade cidade);

}
