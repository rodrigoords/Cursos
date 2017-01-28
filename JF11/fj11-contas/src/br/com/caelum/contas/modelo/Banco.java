package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void adiciona(Conta conta) {
		boolean conseguiuAdicionar = false;
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] == null) {
				this.contas[i] = conta;
				conseguiuAdicionar = true;
				break;
			}

		}
		if (!conseguiuAdicionar) {
			throw new ArrayStoreException("Não foi possível adicionar novas contas.");
		}
	}

	public void mostraContas() {
		for (Conta conta : contas) {
			if(conta != null){				
				System.out.println("Conta [Titular: " + conta.getNomeTitular() + " Numero: " + conta.getNumero()
				+ " Agencia: " + conta.getAgencia() + "]");
			}
		}

	}

}
