package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	private String tipo;
	
	public ContaPoupanca(Pessoa titular) {
		super(titular);
		this.tipo = "Poupança";
	}
	
	@Override
	public String getTipo(){
		return super.getTipo()+ " " + this.tipo;
	}

}
