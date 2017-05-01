package br.com.alura.designpatterns.teste;

import br.com.alura.designpattern.chainofresponsibility.Item;
import br.com.alura.designpattern.strategy.Orcamento;

public class TesteChainOfResponsibility {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		orcamento.adiconaItem(new Item("Patins", 350));
		orcamento.adiconaItem(new Item("Capacete", 50));
		orcamento.adiconaItem(new Item("Kit protecao", 100));
		
		System.out.println(orcamento.getDesconto());
	}

}
