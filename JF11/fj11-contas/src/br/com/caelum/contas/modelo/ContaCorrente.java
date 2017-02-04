package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta  implements Tributavel{
	
	private TipoConta tipo;
	
	public ContaCorrente(Pessoa titular) {
		super(titular);
		this.tipo = TipoConta.CONTA_CORRENTE;
	}
	
	public String getTipo(){
		return this.tipo.getTipo();
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
