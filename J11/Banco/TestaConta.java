class TestaConta{
  public static void main (String[] args){

    Conta c1 = new Conta();
    Pessoa pessoa = new Pessoa();
    Data   dataAbertura = new Data();

    pessoa.nome = "Rodrigo";
    pessoa.cpf  = "1234";

    dataAbertura.dia = "07";
    dataAbertura.mes = "01";
    dataAbertura.ano = "2017";

    c1.titular = pessoa;
    c1.numero = 123;
    c1.agencia = "4567-8";
    c1.saldo = 50.0;
    c1.dataAbertura = dataAbertura;

    c1.deposita(100.0);
    System.out.println(c1.recuperaDadosParaImpressao());
  }
}
