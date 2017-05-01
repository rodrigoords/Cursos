package br.com.alura.designpattern.strategy;

public class ICCC implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = orcamento.getValor();
		double imposto = 0;
		if(valor > 3000){
			imposto = (valor * 0.08) + 30;
		}else if(valor >= 1000){
			imposto = valor * 0.07;
		}else{
			imposto = valor * 0.05;
		}
		
		return imposto;
	}

}
