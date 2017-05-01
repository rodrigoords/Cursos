package br.com.alura.designerpattern.state;

import br.com.alura.designpattern.strategy.Orcamento;

public interface EstadoDeOracamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento);

	public void aprova(Orcamento orcamento);

	public void reprova(Orcamento orcamento);

	public void finaliza(Orcamento orcamento);
}
