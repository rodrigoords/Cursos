package br.com.caelum.contas.main;

import java.util.LinkedList;
import java.util.List;

public class TestaPerfomanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("iniciando...");
		Long inicio = System.currentTimeMillis();
		
		List<Integer> teste = new LinkedList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(i, i);
		}
		
		teste.get(29999);
		
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio);
		
		System.out.println("Tempo gasto: " +tempo);
	}
}
