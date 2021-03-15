package com.henriqueneivafood.domain.repository;

import java.util.List;

import com.henriqueneivafood.domain.model.Estado;

public interface EstadoRepositoy {

	List<Estado> todas();

	Estado porId(long id);

	Estado adicionar(Estado estado);

	void remover(Estado estado);

}
