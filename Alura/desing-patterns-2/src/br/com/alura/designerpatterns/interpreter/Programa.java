package br.com.alura.designerpatterns.interpreter;

import br.com.alura.designerpatterns.visitor.ImpressoraPreFixaVisitor;
import br.com.alura.designerpatterns.visitor.Visitor;

public class Programa {
	public static void main(String[] args) {
		Expressao soma = new Soma(new Numero(10), new Numero(20));
		
		System.out.println(soma.avalia());
		
		Visitor visitor = new ImpressoraPreFixaVisitor();
		
		soma.aceita(visitor);
	}
}
