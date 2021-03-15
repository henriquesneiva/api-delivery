package com.henriqueneivafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.henriqueneivafood.ApiApplication;
import com.henriqueneivafood.domain.model.Restalrante;
import com.henriqueneivafood.domain.repository.RestalranteRepository;

public class InclusaoRestalranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationontext = new SpringApplicationBuilder(ApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		RestalranteRepository restalrante = applicationontext.getBean(RestalranteRepository.class);

		Restalrante restalrante1 = new Restalrante();
		restalrante1.setNome("burgueking");
		

		Restalrante restalrante2 = new Restalrante();
		restalrante2.setNome("habibis");


		restalrante.adicionar(restalrante1);
		restalrante.adicionar(restalrante2);
	}
	
}
