package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	public boolean podeReservar(int qtdAReservar) { 
		
		return capacidade - qtdReservada() > qtdAReservar; 
	}

	private int qtdReservada() {
		int totalReservados = 0;
		for(Vagao vagao : vagoes) {
			totalReservados += vagao.reservados();
		}
		return totalReservados;
	}
	
}