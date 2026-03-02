package Transporte;

public class Metro extends Transporte_publico {
	String linha;
	
	public void mostrarInformacoes() {
		System.out.println("Capacidade: " + capacidade + "\nLinha: " + linha);
	}
}
