package br.com.caelum.contas.modelo;
public class Ano{

  private int ano;

  public Ano(int ano){
    this.ano = ano;
  }

  public int getAno(){
    return this.ano;
  }

  public boolean isBissexto(){
    if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			return true;
		}
		else{
			return false;
		}
  }
  
  public boolean isDiaMesValidoParaAno(Dia dia, Mes mes){
	  if(dia.isValidoParaMes(mes)){
		  if (!this.isBissexto() && mes.getMes() == 2){
			  return dia.getDia() > 28;
		  }
		  return true;
	  }else{
		  return false;
	  }
  }

}
