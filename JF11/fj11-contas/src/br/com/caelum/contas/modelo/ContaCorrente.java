package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	
	private String tipo;
	
	public ContaCorrente(Pessoa titular) {
		super(titular);
		this.tipo = "Corrente";
	}
	
	public String getTipo(){
		return super.getTipo()+ " "+ this.tipo;
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.10);
	}

}
