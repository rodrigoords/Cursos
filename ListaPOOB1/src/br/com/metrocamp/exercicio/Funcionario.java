package br.com.metrocamp.exercicio;

public class Funcionario {
	private String nome;
	private double salario;
	private boolean motorista;
	private TipoInstrucao instrucao;
	private boolean salarioAjustado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salarioAjustado = false;
		this.salario = salario;
		this.CalcSalario();
	}

	public boolean isMotorista() {
		return motorista;
	}

	public void setMotorista(boolean motorista) {
		this.motorista = motorista;
	}

	public TipoInstrucao getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(TipoInstrucao instrucao) {
		if (this.instrucao != null) {

			int resultado = this.instrucao.getNivelInstrucao().compareTo(instrucao.getNivelInstrucao());
			if (resultado > 0) {
				this.instrucao = instrucao;
				setSalario(getSalario() * 1.15);
			} else if (resultado < 0) {
				setSalario(getSalario() - (getSalario() * 0.15));
				this.instrucao = instrucao;
			}
		} else {
			this.instrucao = instrucao;
		}

	}

	private boolean isSalarioAjustado() {
		return salarioAjustado;
	}

	/**
	 * Calcula o abono salarial para o funcionario caso o mesmo seja motorista.
	 * Caso o salario já tenha sido calculado anteriormente, não é permitido um
	 * recalculo.
	 */
	public void CalcSalario() {
		if (!isSalarioAjustado() && isMotorista()) {
			this.salario = this.salario * 1.1;
			salarioAjustado = true;
		}
	}

	@Override
	public String toString() {
		String dados;
		dados = "Nome: " + getNome();
		dados += "\nSalário: " + getSalario();
		dados += "\nMotorista: " + (isMotorista() ? "SIM" : "NÃO");
		dados += "\nInstrução: " + getInstrucao();
		
		return dados;
	}
}
