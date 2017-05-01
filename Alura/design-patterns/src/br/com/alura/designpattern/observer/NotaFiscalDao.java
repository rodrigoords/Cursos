package br.com.alura.designpattern.observer;

import br.com.alura.designpattern.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposCriacao {
    public void executa(NotaFiscal notaFiscal) {
      System.out.println("salvando no banco");
    }
  }