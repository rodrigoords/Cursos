package br.com.alura.designpattern.strategy;

public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
