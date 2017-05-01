package br.com.alura.designpattern.observer;

import br.com.alura.designpattern.builder.NotaFiscal;

public class Impressora implements AcaoAposCriacao {
    public void executa(NotaFiscal notaFiscal) {
      System.out.println("imprimindo notaFiscal");
    }
  }