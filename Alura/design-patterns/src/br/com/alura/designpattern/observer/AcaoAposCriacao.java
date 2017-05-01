package br.com.alura.designpattern.observer;

import br.com.alura.designpattern.builder.NotaFiscal;

public interface AcaoAposCriacao {
	public void executa(NotaFiscal notaFiscal);
}
