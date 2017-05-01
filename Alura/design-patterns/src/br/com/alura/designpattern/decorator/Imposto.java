package br.com.alura.designpattern.decorator;

import br.com.alura.designpattern.strategy.Orcamento;

public abstract class Imposto {

	protected final Imposto outroImposto;

	public Imposto() {
		outroImposto = null;
	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double calcula(Orcamento orcamento);

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null)
			return 0;
		return outroImposto.calcula(orcamento);
	}
}