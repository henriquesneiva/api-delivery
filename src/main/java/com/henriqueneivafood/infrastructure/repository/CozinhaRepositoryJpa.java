package com.henriqueneivafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.henriqueneivafood.domain.model.Cozinha;
import com.henriqueneivafood.domain.repository.CozinhaRepository;

@Component
public class CozinhaRepositoryJpa implements CozinhaRepository {

	@PersistenceContext
	private EntityManager manager;

	public List<Cozinha> todas() {
		return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
	}

	public Cozinha porId(long id) {
		return manager.find(Cozinha.class, id);
	}

	@Transactional
	public Cozinha adicionar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}

	@Transactional
	public void remover(Cozinha cozinha) {
		cozinha = porId(cozinha.getId());
		manager.remove(cozinha);
	}

}
