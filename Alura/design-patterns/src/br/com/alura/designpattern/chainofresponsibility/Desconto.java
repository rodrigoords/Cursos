package br.com.alura.designpattern.chainofresponsibility;

import br.com.alura.designpattern.strategy.Orcamento;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	
	public void proximo(Desconto desconto);
}
