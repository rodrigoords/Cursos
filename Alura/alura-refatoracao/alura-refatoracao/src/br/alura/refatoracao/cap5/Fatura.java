package br.alura.refatoracao.cap5;

public class Fatura {

	private static final double REAL = 1.0;
	private static final double DOLAR = 2.7;
	private double valorMensal;
	private String cliente;

	public Fatura() {}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}
	public double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public double emDolar(){
		return aplicaTaxa(DOLAR);
	}
	
	public double emReal(){
		return aplicaTaxa(REAL);
	}
	
	private double aplicaTaxa(double taxa){
		return valorMensal * taxa;
	}
	
}
