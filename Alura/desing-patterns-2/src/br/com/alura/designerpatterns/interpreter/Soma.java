package br.com.alura.designerpatterns.interpreter;

import br.com.alura.designerpatterns.visitor.Visitor;

public class Soma implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;
	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	
	}
	@Override
	public int avalia() {
		return esquerda.avalia() + direita.avalia();
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}
	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSoma(this);
	}

}
