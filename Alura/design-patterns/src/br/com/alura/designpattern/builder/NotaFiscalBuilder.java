package br.com.alura.designpattern.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.designpattern.observer.AcaoAposCriacao;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private String observacoes;
	private Calendar data;
	private List<AcaoAposCriacao> acoesASeremExecutadas = new ArrayList<>();
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}
	
	public void adicionaAcao(AcaoAposCriacao novaAcao){
		acoesASeremExecutadas.add(novaAcao);
	}
	
    public NotaFiscal build() {
        NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
        
        acoesASeremExecutadas.forEach((acao)->acao.executa(notaFiscal));
        
        return notaFiscal;
      }	
}