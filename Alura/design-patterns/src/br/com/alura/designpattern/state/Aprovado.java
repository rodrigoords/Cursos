package br.com.alura.designpattern.state;

import br.com.alura.designpattern.strategy.Orcamento;

public class Aprovado implements EstadoDeOracamento{

	private boolean descontoAplicadoAnteriormente;
	
	public Aprovado(){
		this.descontoAplicadoAnteriormente = false;
	}
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(descontoAplicadoAnteriormente){
			throw new RuntimeException("Já foi aplicado um desconto para este orçamento");
		}else{			
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.02));
			descontoAplicadoAnteriormente = true;
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já se encontra em estado aprovado.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento aprovado não pode ser reprovado.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Finalizado());
	}

}
