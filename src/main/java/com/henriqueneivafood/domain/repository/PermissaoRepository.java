package com.henriqueneivafood.domain.repository;

import java.util.List;

import com.henriqueneivafood.domain.model.Permissao;

public interface PermissaoRepository {
	
	List<Permissao> todas();

	Permissao porId(long id);

	Permissao adicionar(Permissao permissao);

	void remover(Permissao permissao);
	
}
