package br.com.alura.designpattern.strategy;

public class CalculaImposto {
	public double calculoImposto(Orcamento orcamento, Imposto imposto){
		return imposto.calcula(orcamento);
	}
}
