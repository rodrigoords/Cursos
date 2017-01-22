package br.com.caelum.contas.modelo;
public class Dia{

  private int dia;

  public Dia(int dia){
    if(dia > 0 && dia <= 31){
      this.dia = dia;
    }
    return;
  }

  public int getDia(){
    return this.dia;
  }

  public boolean isValidoParaMes(Mes mes){
	  if(this.dia == 31 && !mes.isTrintaEUmDias()){
		  return false;
	  }else if(mes.getMes() == 2 && this.dia > 29){
		  return false;
	  }
	  
	  return true;
  }
  
}
