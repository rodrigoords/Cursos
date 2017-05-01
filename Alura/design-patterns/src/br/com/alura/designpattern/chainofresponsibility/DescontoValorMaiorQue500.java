package br.com.alura.designpattern.chainofresponsibility;

import br.com.alura.designpattern.strategy.Orcamento;

public class DescontoValorMaiorQue500 implements Desconto{

	private Desconto desconto;

	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500){
			return orcamento.getValor() * 0.07;
		}else{
			return desconto.desconta(orcamento);
		}
	}

	@Override
	public void proximo(Desconto desconto) {
		this.desconto = desconto;
		
	}
	
}
