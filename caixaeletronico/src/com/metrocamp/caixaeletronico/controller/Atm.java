package com.metrocamp.caixaeletronico.controller;

import java.math.BigDecimal;

import com.metrocamp.caixaeletronico.utils.Numerario;

public class Atm {
	
	private Bandeja b1;
	private Bandeja b2;
	private Bandeja b3;
	private Bandeja b4;
	
	private BigDecimal saldo;
	
	private String[] log;

	public Atm(Bandeja b1, Bandeja b2, Bandeja b3, Bandeja b4) {
		super();
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
	}
	
	public BigDecimal consultaSaldo(){
		return this.saldo;
	}
	
	public void insereNotasBandeja(Numerario tipoNumerario, Integer quantidade){
		
		if (b1.getTipoNumerario().equals(tipoNumerario.getTipoNumerario())){
			b1.adicionaQuantidade(quantidade);
		}else if(b2.getTipoNumerario().equals(tipoNumerario.getTipoNumerario())){
			b2.adicionaQuantidade(quantidade);
		}else if(b3.getTipoNumerario().equals(tipoNumerario.getTipoNumerario())){
			b3.adicionaQuantidade(quantidade);
		}else if(b4.getTipoNumerario().equals(tipoNumerario.getTipoNumerario())){
			b4.adicionaQuantidade(quantidade);
		}else{
			//TODO Incluir uma exception para que nao atualize o saldo em caso de não existir nota.
			System.out.println("Nenhuma bandeja para esse tipo numerario");
		}
		
		this.atualizaSaldoATM();
	}
	
	public void deposita(ContaCorrente cc,BigDecimal valor){
		cc.deposito(valor);
	}
	
	public void saque(ContaCorrente cc,BigDecimal valor){
		cc.saque(valor);
	}
	
	public void addBandeja(Integer posicao, Bandeja bandeja){
		
		bandeja.ativaBandeja();
		
		this.posicionaBandeja(posicao, bandeja);
		
		this.atualizaSaldoATM();
	}
	
	public void removerBandeja(Integer posicao, Bandeja bandeja){
		
		bandeja.desativaBandeja();
		
		this.posicionaBandeja(posicao, bandeja);
		
		this.atualizaSaldoATM();
	}
	
	private void posicionaBandeja(Integer posicao, Bandeja bandeja){
		
		if (posicao == 1){
			b1 = bandeja;
		}else if(posicao == 2){
			b2 = bandeja;
		}else if(posicao == 3){
			b3 = bandeja;
		}else if(posicao == 4){
			b4 = bandeja;
		}else{
			//TODO Incluir uma exception para que não deixe inserir bandeja em posiçao errada.
			System.out.println("posição invalida");
		}
	}
	
	private void atualizaSaldoATM(){
		BigDecimal saldoBandejas = new BigDecimal("0");
		
		if(b1.verificaStatusBandeja()){
			saldo.add(b1.verificaSaldo());
		}
		if(b2.verificaStatusBandeja()){
			saldo.add(b1.verificaSaldo());
		}
		if(b3.verificaStatusBandeja()){
			saldo.add(b1.verificaSaldo());
		}
		if(b4.verificaStatusBandeja()){
			saldo.add(b1.verificaSaldo());
		}
		
		this.saldo = saldoBandejas;
	}

}
