package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	private TipoConta tipo;
	
	public ContaPoupanca(Pessoa titular) {
		super(titular);
		this.tipo = TipoConta.CONTA_POUPANCA;
	}
	
	@Override
	public String getTipo(){
		return this.tipo.getTipo();
	}

}
