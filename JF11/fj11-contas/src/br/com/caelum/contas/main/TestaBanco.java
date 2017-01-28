package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Pessoa;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank",999);
		
		for (int i = 0; i < 5; i++) {
			ContaCorrente conta = new ContaCorrente(new Pessoa("Titular"+i));
			
			conta.setNumero(i);
			conta.setAgencia("0012");
			conta.deposita(i*1000);
			banco.adiciona(conta);
			
		}
		
		banco.mostraContas();
	}
}
