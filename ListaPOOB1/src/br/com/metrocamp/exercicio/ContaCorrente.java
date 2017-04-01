package br.com.metrocamp.exercicio;

import java.math.BigDecimal;

public class ContaCorrente {
	private String nome;
	private String numeroConta;
	private BigDecimal saldo = BigDecimal.ZERO;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void saque(BigDecimal valor){
		if(valor.compareTo(saldo) <= 0){
			this.saldo = this.saldo.subtract(valor);
			System.out.println("Saque efetuado com sucesso!");
		}else{
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void deposito(BigDecimal valor){
		if(valor.compareTo(BigDecimal.ZERO) > 0){
			this.saldo = this.saldo.add(valor);
		}else{
			System.out.println("Valor inválido para depósito!");
		}
	}
	
	@Override
	public String toString() {
		String dados;
		
		dados = "Nome: "+nome;
		dados += "\nNumero Conta: " +numeroConta;
		dados += "\nSaldo: " + saldo;
		
		return dados;
	}
}
