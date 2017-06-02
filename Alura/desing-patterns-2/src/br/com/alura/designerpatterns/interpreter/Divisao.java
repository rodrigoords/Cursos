package br.com.alura.designerpatterns.interpreter;

import br.com.alura.designerpatterns.visitor.Visitor;

public class Divisao implements Expressao{
	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}
	
	@Override
	public int avalia() {
		return esquerda.avalia() / direita.avalia();
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaDivisao(this);
	}
}
