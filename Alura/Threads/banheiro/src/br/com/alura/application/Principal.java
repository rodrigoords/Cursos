package br.com.alura.application;

import br.com.alura.modelo.Banheiro;
import br.com.alura.modelo.FazNumero1;
import br.com.alura.modelo.FazNumero2;

public class Principal {
	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new FazNumero1(banheiro), "João");
		Thread convidado2 = new Thread(new FazNumero2(banheiro), "Pedro");	
		
		convidado1.start();
		convidado2.start();
	}
}
