package br.com.alura.designpattern.decorator;

import java.util.Calendar;

public class Conta {
	private double valor; 
	private Calendar dataAbertura;
	
	public double getValor(){
		return valor;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
