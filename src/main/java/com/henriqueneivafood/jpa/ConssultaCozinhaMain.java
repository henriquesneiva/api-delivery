package com.henriqueneivafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.henriqueneivafood.ApiApplication;
import com.henriqueneivafood.domain.model.Cozinha;
import com.henriqueneivafood.domain.repository.CozinhaRepository;

public class ConssultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationontext = new SpringApplicationBuilder(ApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CozinhaRepository cozinhas = applicationontext.getBean(CozinhaRepository.class);
		List<Cozinha> todasCozinhas = cozinhas.todas();

		for (Cozinha cozinha : todasCozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
}
