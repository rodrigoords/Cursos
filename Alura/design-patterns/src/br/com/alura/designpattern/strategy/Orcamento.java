package br.com.alura.designpattern.strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.com.alura.designpattern.chainofresponsibility.Desconto;
import br.com.alura.designpattern.chainofresponsibility.DescontoAcimaDeCincoItens;
import br.com.alura.designpattern.chainofresponsibility.DescontoValorMaiorQue500;
import br.com.alura.designpattern.chainofresponsibility.Item;
import br.com.alura.designpattern.chainofresponsibility.SemDesconto;
import br.com.alura.designpattern.state.EmAprovacao;
import br.com.alura.designpattern.state.EstadoDeOracamento;

public class Orcamento {

	private double valor;
	private final List<Item> itens;
	private EstadoDeOracamento estadoOrcamento;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoOrcamento = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void adiconaItem(Item item){
		this.itens.add(item);
	}
	
	public Collection<Item> getItens(){
		return Collections.unmodifiableCollection(itens);
	}
	
	public double getDesconto() {
		Desconto d1 = new DescontoAcimaDeCincoItens();
		Desconto d2 = new DescontoValorMaiorQue500();
		Desconto d3 = new SemDesconto();
		
		d1.proximo(d2);
		d2.proximo(d3);
		
		return d1.desconta(this);
		
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public void setEstadoOrcamento(EstadoDeOracamento estadoOrcamento){
		this.estadoOrcamento = estadoOrcamento;
	}
	
	public void aplicaDescontoExtra(){
		estadoOrcamento.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		estadoOrcamento.aprova(this);
	}
	
	public void reprova(){
		estadoOrcamento.reprova(this);
	}
	
	public void finaliza(){
		estadoOrcamento.finaliza(this);
	}

}
