package br.com.alura.designpattern.decorator;

import br.com.alura.designpattern.strategy.Orcamento;

public class ISS extends Imposto{
	
	public ISS(){
	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
