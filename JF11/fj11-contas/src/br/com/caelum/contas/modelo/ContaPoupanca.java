package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	private String tipo;
	
	public ContaPoupanca(Pessoa titular) {
		super(titular);
		this.tipo = "Conta Poupança";
	}
	
	@Override
	public String getTipo(){
		return this.tipo;
	}

}
