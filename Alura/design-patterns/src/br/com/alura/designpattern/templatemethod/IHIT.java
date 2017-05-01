package br.com.alura.designpattern.templatemethod;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.designpattern.chainofresponsibility.Item;
import br.com.alura.designpattern.strategy.Orcamento;

public class IHIT extends TemplateDeImposto{
	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return temItensComMesmoNome(orcamento);
	}

	private boolean temItensComMesmoNome(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItens()) {
          if(noOrcamento.contains(item.getNome())) return true;
          else noOrcamento.add(item.getNome());
        }

        return false;
		
	}

}
