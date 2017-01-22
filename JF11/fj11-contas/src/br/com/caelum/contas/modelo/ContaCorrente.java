package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta  implements Tributavel{
	
	private String tipo;
	
	public ContaCorrente(Pessoa titular) {
		super(titular);
		this.tipo = "Conta Corrente";
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
