package com.metrocamp.caixaeletronico.utils;

public enum Numerario {
	
	NOTA_DOIS("2"), 
	NOTA_CINCO("5"), 
	NOTA_DEZ("10"), 
	NOTA_VINTE("20"), 
	NOTA_CINQUENTA("50"), 
	NOTA_CEM("100");
	
	private String tipoNumerario;
	
	private Numerario(String tipoNumerario){
		this.tipoNumerario = tipoNumerario;
	}
	
	public String getTipoNumerario(){
		return tipoNumerario;
	}
}
