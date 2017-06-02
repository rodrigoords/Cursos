package br.com.alura.designerpatterns.interpreter;

import br.com.alura.designerpatterns.visitor.Visitor;

public interface Expressao {
	int avalia();
	void aceita(Visitor visitor);
}
