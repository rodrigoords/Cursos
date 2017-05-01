package br.com.alura.designpattern.templatemethod;

import br.com.alura.designpattern.chainofresponsibility.Item;
import br.com.alura.designpattern.strategy.Orcamento;

public class IKCV extends TemplateDeImposto {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}

		return false;
	}

}
