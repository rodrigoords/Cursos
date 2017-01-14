class Conta{
  Pessoa titular;
  int    numero;
  String agencia;
  double saldo;
  Data   dataAbertura;

  boolean saca(double valor){
    if(saldo >= valor){
      saldo -= valor;
      return true;
    }
    return false;
  }

  void deposita(double valor){
    saldo += valor;
  }

  double calculaRendimento(){
    return this.saldo * 0.1;
  }

  String recuperaDadosParaImpressao(){
    String dados = "Titular: "+ this.titular.nome;
    dados += "\nNumero: "+ this.numero;
    dados += "\nAgencia: "+ this.agencia;
    dados += "\nData Abertura: "+ this.dataAbertura.imprimeData();
    dados += "\nSaldo: "+ this.saldo;
    dados += "\nRendimento: "+ calculaRendimento();

    return dados;
  }
}
