package br.edu.fateccotia.isw029.imc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fateccotia.isw029.imc.entity.Imc;
import br.edu.fateccotia.isw029.imc.service.ImcService;

@SpringBootApplication
public class ImcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImcApplication.class, args);
		
	}

}