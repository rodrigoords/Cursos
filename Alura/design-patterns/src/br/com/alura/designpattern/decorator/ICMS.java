package br.com.alura.designpattern.decorator;

import br.com.alura.designpattern.strategy.Orcamento;

public class ICMS extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
