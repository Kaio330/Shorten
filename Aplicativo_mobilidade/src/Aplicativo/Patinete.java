package Aplicativo;

public class Patinete extends Transporte{
	
	String empresa;
	
	public void mostrarDados() {
		System.out.println("Marca: " + empresa + "\nVelocidade máxima: " + velocidade);
	}

}
