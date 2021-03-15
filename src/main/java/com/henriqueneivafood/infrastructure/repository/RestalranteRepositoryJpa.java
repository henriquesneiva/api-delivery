package com.henriqueneivafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.henriqueneivafood.domain.model.Restalrante;
import com.henriqueneivafood.domain.repository.RestalranteRepository;

@Component
public class RestalranteRepositoryJpa implements RestalranteRepository {

	@PersistenceContext
	private EntityManager manager;

	public List<Restalrante> todas() {
		return manager.createQuery("from Cozinha", Restalrante.class).getResultList();
	}

	public Restalrante porId(long id) {
		return manager.find(Restalrante.class, id);
	}

	@Transactional
	public Restalrante adicionar(Restalrante restalrante) {
		return manager.merge(restalrante);
	}

	@Transactional
	public void remover(Restalrante restalrante) {
		restalrante = porId(restalrante.getId());
		manager.remove(restalrante);
	}
	
}
