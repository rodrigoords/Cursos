package br.com.alura.designpattern.observer;

import br.com.alura.designpattern.builder.NotaFiscal;

public class Multiplicador implements AcaoAposCriacao{
	
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * this.fator);
	}

}
