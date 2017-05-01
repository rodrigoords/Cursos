package br.com.alura.designpatterns.teste;

import br.com.alura.designpattern.chainofresponsibility.Item;
import br.com.alura.designpattern.strategy.Orcamento;
import br.com.alura.designpattern.templatemethod.ICPP;
import br.com.alura.designpattern.templatemethod.IHIT;
import br.com.alura.designpattern.templatemethod.IKCV;

public class TestTemplateMethod {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		orcamento.adiconaItem(new Item("Patins", 350));
		orcamento.adiconaItem(new Item("Capacete", 50));
		orcamento.adiconaItem(new Item("Kit protecao", 100));
		
		ICPP icpp = new ICPP();
		IKCV ikvc = new IKCV();
		IHIT ihit = new IHIT();
		
		
		System.out.println(icpp.calcula(orcamento));
		System.out.println(ikvc.calcula(orcamento));
		System.out.println(ihit.calcula(orcamento));
		
	}
}
