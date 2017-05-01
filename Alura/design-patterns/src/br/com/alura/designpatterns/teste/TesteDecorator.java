package br.com.alura.designpatterns.teste;

import br.com.alura.designpattern.decorator.ICMS;
import br.com.alura.designpattern.decorator.ISS;
import br.com.alura.designpattern.decorator.Imposto;
import br.com.alura.designpattern.decorator.ImpostoMuitoAlto;
import br.com.alura.designpattern.strategy.Orcamento;

public class TesteDecorator {

	public static void main(String[] args) {
		Imposto impostos = new ISS(new ICMS());

		Orcamento orcamento = new Orcamento(500.0);

		System.out.println(impostos.calcula(orcamento));
		
        impostos = new ImpostoMuitoAlto(new ICMS());

        orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
        
	}
}
