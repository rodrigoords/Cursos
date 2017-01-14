package br.com.caelum.contas.modelo;
/**
 * 
 * @author Rodrigo Sene
 *
 */
public class Conta{

  private static int cont;

  private Pessoa titular;
  private int    numero;
  private String agencia;
  private double saldo;
  private Data   dataAbertura;
  private int    identificador;

  public Conta(Pessoa titular){
    this();
     this.titular = titular;
     this.dataAbertura = new Data(new Dia(1), new Mes(1), new Ano(1990));
  }

  private Conta(){
    cont ++;
    setIdentificador(cont);
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public int getNumero(){
    return this.numero;
  }

  public void setAgencia(String agencia){
    this.agencia = agencia;
  }

  public String getAgencia(){
    return this.agencia;
  }

  public void setIdentificador(int identificador){
    this.identificador = identificador;
  }

  public int getIdentificador(){
    return this.identificador;
  }

  public String getDataAbertura(){
    return this.dataAbertura.imprimeData();
  }
  
  /**
   * Verifica se o valor requerido é menor ou igual ao saldo, caso possítivo debita do saldo 
   * da conta.
   * @param valor
   * @return True  Caso realizado corretamente o saldo.
   *         False Caso não tenha debitado da conta. 
   */
  public boolean saca(double valor){
    if(saldo >= valor){
      saldo -= valor;
      return true;
    }
    return false;
  }

  public void deposita(double valor){
    saldo += valor;
  }

  public double calculaRendimento(){
    return this.saldo * 0.1;
  }

  public String recuperaDadosParaImpressao(){
    String dados = "Titular: "+ this.titular.getNome();
    dados += "\nNumero: "+ this.getNumero();
    dados += "\nAgencia: "+ this.getAgencia();
    dados += "\nData Abertura: "+ this.getDataAbertura();
    dados += "\nSaldo: "+ this.getSaldo();
    dados += "\nRendimento: "+ this.calculaRendimento();
    dados += "\nIdentificador: "+this.getIdentificador();

    return dados;
  }
}
