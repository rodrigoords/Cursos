package br.com.alura.busca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBusca implements Runnable {

	private File file;
	private String busca;

	public TarefaBusca(File file, String busca) {
		this.file = file;
		this.busca = busca.toLowerCase();
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(file);
			int numeroLinha = 1;
			while (scanner.hasNextLine()){
				String linha = scanner.nextLine();
				if(linha.toLowerCase().contains(busca)){
					System.out.println( file.getName() + "-" + numeroLinha + " - " + linha);
				}
				numeroLinha ++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

}
