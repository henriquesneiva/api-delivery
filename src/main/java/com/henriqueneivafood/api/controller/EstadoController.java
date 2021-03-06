package com.henriqueneivafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henriqueneivafood.domain.model.Estado;
import com.henriqueneivafood.domain.repository.EstadoRepositoy;

@RestController
@RequestMapping("/estados")
public class EstadoController {

	@Autowired
	private EstadoRepositoy estadoRepository;
	
	@GetMapping
	public List<Estado> listar() {
		return estadoRepository.todas();
	}

}
