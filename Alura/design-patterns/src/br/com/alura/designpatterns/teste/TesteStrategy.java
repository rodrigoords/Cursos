package br.com.alura.designpatterns.teste;

import br.com.alura.designpattern.strategy.CalculaImposto;
import br.com.alura.designpattern.strategy.ICCC;
import br.com.alura.designpattern.strategy.ICMS;
import br.com.alura.designpattern.strategy.ISS;
import br.com.alura.designpattern.strategy.Orcamento;

public class TesteStrategy {
	public static void main(String[] args) {
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		ICCC iccc = new ICCC();
		
		CalculaImposto calculaImposto = new CalculaImposto();
		
		Orcamento orcamento = new Orcamento(1000);
		Orcamento orcamento2 = new Orcamento(3030);
		
		System.out.println(calculaImposto.calculoImposto(orcamento, icms));
		System.out.println(calculaImposto.calculoImposto(orcamento, iss));
		System.out.println(calculaImposto.calculoImposto(orcamento, iccc));
		System.out.println(calculaImposto.calculoImposto(orcamento2, iccc));
	}
}
