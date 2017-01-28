package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Pessoa;

public class TestaArray {
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente(new Pessoa("Rodrigo"));
			conta.deposita(i * 100.0);
			contas[i] = conta;
		}
		
		double saldoTotal = 0;
		
		for (int i = 0; i < contas.length; i++) {
			saldoTotal += contas[i].getSaldo();
			
		}
		
		System.out.println(saldoTotal/contas.length);
	}
}
