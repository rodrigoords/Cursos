package br.com.alura.designpattern.templatemethod;

import br.com.alura.designpattern.strategy.Imposto;
import br.com.alura.designpattern.strategy.Orcamento;

public abstract class TemplateDeImposto implements Imposto{
	public double calcula(Orcamento orcamento){
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
