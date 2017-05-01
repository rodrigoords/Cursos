package br.com.alura.designpattern.chainofresponsibility;

import br.com.alura.designpattern.strategy.Orcamento;

public class DescontoAcimaDeCincoItens implements Desconto{

	private Desconto desconto;

	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}else{
			return desconto.desconta(orcamento);
		}
	}

	@Override
	public void proximo(Desconto desconto) {
		this.desconto = desconto;
	}

}
