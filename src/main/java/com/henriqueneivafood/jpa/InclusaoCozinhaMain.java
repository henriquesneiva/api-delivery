package com.henriqueneivafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.henriqueneivafood.ApiApplication;
import com.henriqueneivafood.domain.model.Cozinha;
import com.henriqueneivafood.domain.repository.CozinhaRepository;

public class InclusaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationontext = new SpringApplicationBuilder(ApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CozinhaRepository cozinhaRepositoy = applicationontext.getBean(CozinhaRepository.class);

		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("brasileira");

		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("japonesa");

		cozinhaRepositoy.adicionar(cozinha1);
		cozinhaRepositoy.adicionar(cozinha2);
	}
}
