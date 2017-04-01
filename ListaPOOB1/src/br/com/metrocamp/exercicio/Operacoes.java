package br.com.metrocamp.exercicio;

public class Operacoes {
	private Long num1;
	private Long num2;
	
	public Operacoes(Long num1, Long num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Long soma(){
		return this.num1 + this.num2;
	}
	
	public Long subtracao(){
		return this.num1 - this.num2;
	}
	
	public Long multiplicacao(){
		return this.num1 * this.num2;
	}
	
	public Long divisao(){
		return this.num1 / this.num2;
	}
}
