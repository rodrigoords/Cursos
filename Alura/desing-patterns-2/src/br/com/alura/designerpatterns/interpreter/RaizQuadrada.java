package br.com.alura.designerpatterns.interpreter;

import br.com.alura.designerpatterns.visitor.Visitor;

public class RaizQuadrada implements Expressao{

	private Expressao radicano;

	public RaizQuadrada(Expressao radicano) {
		this.radicano = radicano;
	}

	public Expressao getRadicano() {
		return radicano;
	}
	
	@Override
	public int avalia() {
		return (int)Math.sqrt(radicano.avalia());
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
	}
	
}
