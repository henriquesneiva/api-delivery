package com.henriqueneivafood.domain.repository;

import java.util.List;

import com.henriqueneivafood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {

	List<FormaPagamento> todas();
	
	FormaPagamento porId(long id);
	
	FormaPagamento adicionar(FormaPagamento formaPagamento);
	
	void remover(FormaPagamento formaPagamento);
}
