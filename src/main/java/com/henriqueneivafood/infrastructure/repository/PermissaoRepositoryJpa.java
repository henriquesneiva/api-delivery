package com.henriqueneivafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.henriqueneivafood.domain.model.Permissao;
import com.henriqueneivafood.domain.repository.PermissaoRepository;

@Component
public class PermissaoRepositoryJpa implements PermissaoRepository{
	
	@PersistenceContext
	private EntityManager manager;

	public List<Permissao> todas() {
		return manager.createQuery("from Permissao", Permissao.class).getResultList();
	}

	public Permissao porId(long id) {
		return manager.find(Permissao.class, id);
	}

	@Transactional
	public Permissao adicionar(Permissao permissao) {
		return manager.merge(permissao);
	}

	@Transactional
	public void remover(Permissao permissao) {
		permissao = porId(permissao.getId());
		manager.remove(permissao);
	}
	
	
}
