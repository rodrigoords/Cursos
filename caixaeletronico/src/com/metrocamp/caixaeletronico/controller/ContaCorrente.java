package com.metrocamp.caixaeletronico.controller;

import java.math.BigDecimal;

public class ContaCorrente {
	private String nome;
	private Long conta;
	private BigDecimal saldo;
	private BigDecimal limite;
	
	public ContaCorrente(String nome, Long conta, BigDecimal saldo) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void saque(BigDecimal valor){
		this.atualizaValorCC(valor.multiply(new BigDecimal("-1")));
	}
	
	public void deposito(BigDecimal valor){
		this.atualizaValorCC(valor);
	}
	
	public void defineLimiteEspecial(BigDecimal valor){
		this.limite = valor;
	}
	
	public BigDecimal consultaSaldo(){
		return this.saldo;
	}
	
	private void atualizaValorCC(BigDecimal valor){
		this.saldo = this.saldo.add(valor);
	}
	
}
