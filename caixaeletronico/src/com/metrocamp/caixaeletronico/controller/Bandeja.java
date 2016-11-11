package com.metrocamp.caixaeletronico.controller;

import java.math.BigDecimal;

import com.metrocamp.caixaeletronico.utils.Numerario;

public class Bandeja {
	
	private Boolean ativa = false;
	private String tipoNumerario;
	private Integer quantidadeNumerario;
	
	public Bandeja(Numerario tipoNumerario, Integer quantidade){
		this.tipoNumerario = tipoNumerario.getTipoNumerario();
		this.quantidadeNumerario = quantidade;
	}
	
	public void desativaBandeja(){
		this.ativa = false;
	}
	
	public void ativaBandeja(){
		this.ativa = true;
	}
	
	public Boolean verificaStatusBandeja(){
		return this.ativa;
	}
	
	public void adicionaQuantidade(Integer quantidade){
		this.quantidadeNumerario = this.quantidadeNumerario + quantidade;
	}
	
	public String getTipoNumerario(){
		return tipoNumerario;
	}
	
	public BigDecimal verificaSaldo(){
		return new BigDecimal(this.tipoNumerario).multiply(new BigDecimal(this.quantidadeNumerario));
	}
}
