package br.com.caelum.desafios;

public class AnoBissexto {

	public boolean isBissexto(int ano) {
		Boolean retorno = false;
		
		if(ano%400 == 0){
			retorno = true;
		}else if(ano%100 == 0){
			retorno = false;
		}else if(ano%4 == 0){
			retorno = true;
		}
		
		return retorno;
	}
	
}
