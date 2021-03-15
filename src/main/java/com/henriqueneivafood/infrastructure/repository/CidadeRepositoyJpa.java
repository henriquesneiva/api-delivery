package com.henriqueneivafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.henriqueneivafood.domain.model.Cidade;
import com.henriqueneivafood.domain.repository.CidadeRepositoy;

@Component
public class CidadeRepositoyJpa implements CidadeRepositoy{

	@PersistenceContext
	private EntityManager manager;

	public List<Cidade> todas() {
		return manager.createQuery("from Cidade", Cidade.class).getResultList();
	}

	public Cidade porId(long id) {
		return manager.find(Cidade.class, id);
	}

	@Transactional
	public Cidade adicionar(Cidade cidade) {
		return manager.merge(cidade);
	}

	@Transactional
	public void remover(Cidade cidade) {
		cidade = porId(cidade.getId());
		manager.remove(cidade);
	}
	
}
