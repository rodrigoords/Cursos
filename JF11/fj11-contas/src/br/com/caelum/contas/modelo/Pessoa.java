package br.com.caelum.contas.modelo;
public class Pessoa {
	private String nome;
	private String cpf;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
