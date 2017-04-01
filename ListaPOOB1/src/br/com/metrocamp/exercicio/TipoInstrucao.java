package br.com.metrocamp.exercicio;

public enum TipoInstrucao {
	FUNDAMENTAL(0), 
	MEDIO(1), 
	GRADUADO(2), 
	POS_GRADUADO(3);
	
	private Integer nivel;
	
	private TipoInstrucao(Integer nivel) {
		this.nivel = nivel;
	}
	
	public Integer getNivelInstrucao(){
		return nivel;
	}
}
