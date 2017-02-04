package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
	public static void main(String[] args) {
		
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		System.out.println("Iniciando");
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempo);
	}
}
