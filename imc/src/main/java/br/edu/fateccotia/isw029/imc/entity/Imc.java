package br.edu.fateccotia.isw029.imc.entity;

public class Imc {
	//Attributes
	public Double indice;
	public String classificado;
	//Constructor
	public Imc(Double indice, String classificado) {
	super();
	this.classificado = classificado;
	this.indice = indice;
	}
	//Getters and Setters
	public Double getIndice() {
		return indice;
	}

	public void setIndice(Double indice) {
		this.indice = indice;
	}

	public String getClassificado() {
		return classificado;
	}

	public void setClassificado(String classificado) {
		this.classificado = classificado;
	}
	
	
}
