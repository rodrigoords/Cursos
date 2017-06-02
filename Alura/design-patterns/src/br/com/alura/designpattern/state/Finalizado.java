package br.com.alura.designpattern.state;

import br.com.alura.designpattern.strategy.Orcamento;

public class Finalizado implements EstadoDeOracamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não devem receber descontos.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está finalizado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está finalizado");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está finalizado");		
	}

}
