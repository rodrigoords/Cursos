package br.com.alura.application;
import java.io.File;

import br.com.alura.busca.TarefaBusca;

public class Principal {

	public static void main(String[] args) {

		String busca = "a";
		File fileAssinatura1 = new File("assinaturas1.txt");
		File fileAssinatura2 = new File("assinaturas2.txt");
		File autores = new File("autores.txt");
		
		Thread threadAssinatura1 = new Thread(new TarefaBusca(fileAssinatura1, busca));
		Thread threadAssinatura2 = new Thread(new TarefaBusca(fileAssinatura2, busca));
		Thread threadAutores = new Thread(new TarefaBusca(autores, busca));
		
		threadAssinatura1.start();
		threadAssinatura2.start();
		threadAutores.start();
	}

}
