package br.com.alura.designpattern.chainofresponsibility;

import br.com.alura.designpattern.strategy.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void proximo(Desconto desconto) {
		//Fim da cadeia não deve fazer nada;
	}

}
