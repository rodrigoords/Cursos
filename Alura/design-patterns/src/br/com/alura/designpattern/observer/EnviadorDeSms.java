package br.com.alura.designpattern.observer;

import br.com.alura.designpattern.builder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposCriacao {
    public void executa(NotaFiscal notaFiscal) {
      System.out.println("enviando por sms");
    }
  }