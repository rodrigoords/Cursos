package br.com.caelum.contas.modelo;

/**
 * 
 * @author Rodrigo Sene
 *
 */
public abstract class Conta implements Comparable<Conta>{

	private static int cont;
	private Pessoa titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;
	private int identificador;
	
	public Conta(Pessoa titular) {
		this();
		this.titular = titular;
		this.dataAbertura = new Data(new Dia(1), new Mes(1), new Ano(1990));
	}

	private Conta() {
		cont++;
		setIdentificador(cont);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public static int getCont() {
		return cont;
	}

	public String getTitular() {
		return this.titular.getNome();
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public String getDataAbertura() {
		return this.dataAbertura.imprimeData();
	}
	
	/**
	 * Verifica se o valor requerido é menor ou igual ao saldo, caso possítivo
	 * debita do saldo da conta.
	 * 
	 * @param valor
	 * 
	 */
	public void saca(double valor) {
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou sacar um valor negativo!");
		}
		if (saldo < valor) {
			throw new SaldoInsuficienteException("O saldo em conta não é suficiente!");
		}
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou depositar um valor negativo!");
		}
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public abstract String getTipo();
	
	public String toString() {
		String dados = "[ Tipo: "+this.getTipo();
		       dados += ", Titular: " + this.titular.getNome().toUpperCase();
			   dados += ", Numero: " + this.getNumero();
		       dados += ", Agencia: " + this.getAgencia() + "]";
		return dados;
	}
	
	public String formatoSalvar(){
		String retorno =  this.getTipo() + ",";
		       retorno += this.titular.getNome().toUpperCase() + ",";
		       retorno += this.getNumero() + ",";
		       retorno += this.getAgencia() + ", ";
		       retorno += this.getSaldo();
		return retorno;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Conta){
			Conta comparacao = (Conta) obj;
			if(comparacao != null){
				return comparacao.getNumero() == this.getNumero() && 
					   comparacao.getAgencia() == this.getAgencia();
			}
		}
		return false;
	}
	
	public int compareTo(Conta outraConta){
		return this.getTitular().compareTo(outraConta.getTitular());
	}
}
