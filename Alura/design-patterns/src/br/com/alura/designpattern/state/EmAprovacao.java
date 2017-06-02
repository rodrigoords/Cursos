package br.com.alura.designpattern.state;

import br.com.alura.designpattern.strategy.Orcamento;

public class EmAprovacao implements EstadoDeOracamento{

	private boolean descontoAplicadoAnteriormente;

	public EmAprovacao() {
		descontoAplicadoAnteriormente = false;
	}
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(descontoAplicadoAnteriormente){
			throw new RuntimeException("Já foi aplicado um desconto para este orçamento");
		}else{			
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.05));
			descontoAplicadoAnteriormente = true;
		}
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Reprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Não é possível finalizar o arçamento sem antes aprova-lo");
	}

}
