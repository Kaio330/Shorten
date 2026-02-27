package fateccotia;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class BuscaCEP {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		System.out.println("sistema de Consulta de CEP");
		
		System.out.println("Digite o CEP ou 0 para sair:");
		Scanner sc = new Scanner(System.in);
		String cep = sc.nextLine();
		
		cep = cep.replaceAll("[\\D]", "");
		
		String url = "https://viacep.com.br/ws/" + cep +"/json";
		var req = HttpRequest.newBuilder(new URI(url)).build();
		var client = HttpClient.newBuilder().build();
		var res = client.send(req, BodyHandlers.ofString());
		
		System.out.println(res.body());
		
		sc.close();

	}

}
