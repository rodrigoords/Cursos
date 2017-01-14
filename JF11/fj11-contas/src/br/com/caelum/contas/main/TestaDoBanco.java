package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Pessoa;

class TestaDoBanco{
  public static void main (String[] args){

    System.out.println("\nConta 1\n");
    Pessoa pessoa = new Pessoa("Rodrigo", "1234");
    Conta c1 = new Conta(pessoa);

    c1.setNumero(123);
    c1.setAgencia("4567-8");

    c1.deposita(100.0);
    System.out.println(c1.recuperaDadosParaImpressao());

    //Conta 2
    System.out.println("\nConta 2\n");
    Pessoa pessoaB = new Pessoa("André", "123456");
    Conta c2 = new Conta(pessoaB);

    c2.setNumero(1234);
    c2.setAgencia("4267-89");

    c2.deposita(200.0);
    System.out.println(c2.recuperaDadosParaImpressao());
  }
}
