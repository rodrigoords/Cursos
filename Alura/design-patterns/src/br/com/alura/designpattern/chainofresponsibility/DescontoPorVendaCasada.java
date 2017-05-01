package br.com.alura.designpattern.chainofresponsibility;

import br.com.alura.designpattern.strategy.Orcamento;

public class DescontoPorVendaCasada implements Desconto{
	
	private Desconto desconto;

	@Override
	public double desconta(Orcamento orcamento) {
		if(existe("LAPIS", orcamento) && existe("CANETA", orcamento)){
			return orcamento.getValor() * 0.05;
		}else{
			return desconto.desconta(orcamento);
		}
	}

	@Override
	public void proximo(Desconto desconto) {
		this.desconto = desconto;
	}

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
