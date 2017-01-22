package br.com.caelum.contas.modelo;
public class Mes{

  private int mes;

  public Mes(int mes){
    if(mes > 0 && mes <= 12){
      this.mes = mes;
    }
    return;
  }

  public int getMes(){
    return this.mes;
  }

  public boolean isTrintaEUmDias(){
    return mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
  }

}
