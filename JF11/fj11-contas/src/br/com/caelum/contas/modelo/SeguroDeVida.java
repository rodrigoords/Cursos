package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
	
	private double valor;
	private Pessoa titular;
	private int numeroApolice;
	private String tipo = "Seguro de Vida";
	
	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTitular() {
		return titular.getNome();
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
}
