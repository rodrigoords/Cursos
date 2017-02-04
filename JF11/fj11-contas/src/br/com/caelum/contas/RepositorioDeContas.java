package br.com.caelum.contas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.Pessoa;
import br.com.caelum.contas.modelo.TipoConta;

public class RepositorioDeContas {
	
	public void salva(List<Conta> contas){
		PrintStream stream;
		try {
			stream = new PrintStream("contas.txt");
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Não foi possível ler o arquivo");
		}
		for(Conta conta : contas){
			stream.println(conta.formatoSalvar());
		}
		stream.close();
	}

	public List<Conta> carrega() {
		
		Scanner scanner = null;
		String linha= null;
		
		try {
			scanner = new Scanner(new File("contas.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		List<Conta> contasRetorno = new ArrayList<>();


		while(scanner.hasNextLine()){
			
			linha = scanner.nextLine();
			
			String[] valores = linha.split(",");
			Conta conta;
			
			if (valores[0].trim().equals(TipoConta.CONTA_CORRENTE.getTipo()) ){
				conta = new ContaCorrente(new Pessoa(valores[1]));
			}else if(valores[0].trim().equals(TipoConta.CONTA_POUPANCA.getTipo()) ){
				conta = new ContaPoupanca(new Pessoa(valores[1]));
			}else{
				throw new RuntimeException("Tipo de conta não suportado");
			}
			
			//Seta os valores da conta.
			conta.setNumero(Integer.parseInt(valores[2]));
			conta.setAgencia(valores[3]);
			conta.deposita(new Double(valores[4]));
			
			contasRetorno.add(conta);
			
		}
		
		scanner.close();
		
		return contasRetorno;
	}
}
