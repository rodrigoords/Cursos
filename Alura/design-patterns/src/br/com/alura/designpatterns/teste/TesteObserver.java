package br.com.alura.designpatterns.teste;

import br.com.alura.designpattern.builder.ItemDaNota;
import br.com.alura.designpattern.builder.NotaFiscalBuilder;
import br.com.alura.designpattern.observer.EnviadorDeEmail;
import br.com.alura.designpattern.observer.EnviadorDeSms;
import br.com.alura.designpattern.observer.Impressora;
import br.com.alura.designpattern.observer.NotaFiscalDao;

public class TesteObserver {
    public static void main(String[] args) {
      NotaFiscalBuilder builder = new NotaFiscalBuilder();
      builder.adicionaAcao(new EnviadorDeEmail());
      builder.adicionaAcao(new NotaFiscalDao());
      builder.adicionaAcao(new EnviadorDeSms());
      builder.adicionaAcao(new Impressora());

      builder.paraEmpresa("Caelum")
                        .comCnpj("123.456.789/0001-10")
                        .comItem(new ItemDaNota("item 1", 100.0))
                        .comItem(new ItemDaNota("item 2", 200.0))
                        .comItem(new ItemDaNota("item 3", 300.0))
                        .comObservacoes("entregar notaFiscal pessoalmente")
                        .naDataAtual()
                        .build();
    }
  }