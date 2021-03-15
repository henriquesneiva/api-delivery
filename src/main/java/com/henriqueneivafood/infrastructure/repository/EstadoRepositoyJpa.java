package com.henriqueneivafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.henriqueneivafood.domain.model.Estado;
import com.henriqueneivafood.domain.repository.EstadoRepositoy;

@Component
public class EstadoRepositoyJpa implements EstadoRepositoy{

	@PersistenceContext
	private EntityManager manager;

	public List<Estado> todas() {
		return manager.createQuery("from Estado", Estado.class).getResultList();
	}

	public Estado porId(long id) {
		return manager.find(Estado.class, id);
	}

	@Transactional
	public Estado adicionar(Estado estado) {
		return manager.merge(estado);
	}

	@Transactional
	public void remover(Estado estado) {
		estado = porId(estado.getId());
		manager.remove(estado);
	}
	
}
