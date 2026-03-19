package br.edu.fateccotia.isw029.imc.service;

import org.springframework.stereotype.Service;

import br.edu.fateccotia.isw029.imc.entity.Imc;

@Service
public class ImcService {
	
	public  Imc calculate(Double weight, Double height) {
		Double indice = weight/(height * height);
		
		Imc resultado = new Imc(0.0,"Sem Informação");

		if(indice <= 18.5) {
			resultado.setClassificado("Magreza");
			resultado.setIndice(indice);
		}
		else if(indice >= 18.5 && indice <= 24.9) {
			resultado.setClassificado("Eutrofia");
			resultado.setIndice(indice);
		}
		else if(indice >= 25.0 && indice <= 29.9 ) {
			resultado.setClassificado("Sobrepeso");
			resultado.setIndice(indice);
		}
		else if(indice >= 30.0 && indice <= 34.9) {
			resultado.setClassificado("Obesidade I");
			resultado.setIndice(indice);
		}
		else if(indice >= 35.0 && indice < 39.9) {
			resultado.setClassificado("Obesidade II");
			resultado.setIndice(indice);
		}
		else if(indice >= 40) {
			resultado.setClassificado("Obesidade III");
			resultado.setIndice(indice);
		}
		return resultado;
	}
}
