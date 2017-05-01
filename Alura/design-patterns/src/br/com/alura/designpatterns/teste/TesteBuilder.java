package br.com.alura.designpatterns.teste;

import br.com.alura.designpattern.builder.ItemDaNota;
import br.com.alura.designpattern.builder.NotaFiscal;
import br.com.alura.designpattern.builder.NotaFiscalBuilder;

class TesteBuilder {

	public static void main(String[] args) {
		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		criador.paraEmpresa("Caelum");
		criador.comCnpj("123.456.789/0001-10");
		criador.comItem(new ItemDaNota("item 1", 100.0));
		criador.comItem(new ItemDaNota("item 2", 200.0));
		criador.comItem(new ItemDaNota("item 3", 300.0));
		criador.comObservacoes("entregar nf pessoalmente");
		criador.naDataAtual();
		
		NotaFiscal nf = criador.build();
		
		System.out.println(nf.getValorBruto());
	}
}
