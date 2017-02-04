package br.com.caelum.contas.modelo;

public enum TipoConta {
	CONTA_CORRENTE("Conta Corrente"),
	CONTA_POUPANCA("Conta Poupança");
	
	private String tipo;
	
	private TipoConta(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
}
