package br.com.alura.designpattern.state;

import br.com.alura.designpattern.strategy.Orcamento;

public class Reprovado implements EstadoDeOracamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não devem receber descontos");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está em estado reprovado.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está em estado reprovado.");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está em estado reprovado.");		
	}

}
