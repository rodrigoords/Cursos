package br.com.alura.designerpatterns.visitor;

import br.com.alura.designerpatterns.interpreter.Divisao;
import br.com.alura.designerpatterns.interpreter.Multiplicacao;
import br.com.alura.designerpatterns.interpreter.Numero;
import br.com.alura.designerpatterns.interpreter.RaizQuadrada;
import br.com.alura.designerpatterns.interpreter.Soma;
import br.com.alura.designerpatterns.interpreter.Subtracao;

public interface Visitor {
    void visitaSoma(Soma soma);
    void visitaSubtracao(Subtracao subtracao);
    void visitaNumero(Numero numero);
	void visitaDivisao(Divisao divisao);
	void visitaMultiplicacao(Multiplicacao multiplicacao);
	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
}
