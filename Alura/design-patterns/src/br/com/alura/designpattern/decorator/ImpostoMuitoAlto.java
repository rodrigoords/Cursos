package br.com.alura.designpattern.decorator;

import br.com.alura.designpattern.strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto() {
	}
	
	public ImpostoMuitoAlto(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
