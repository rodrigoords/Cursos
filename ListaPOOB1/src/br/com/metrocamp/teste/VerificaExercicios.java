package br.com.metrocamp.teste;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import br.com.metrocamp.exercicio.ContaCorrente;
import br.com.metrocamp.exercicio.Exercicio;
import br.com.metrocamp.exercicio.Filme;
import br.com.metrocamp.exercicio.Funcionario;
import br.com.metrocamp.exercicio.Operacoes;
import br.com.metrocamp.exercicio.TipoInstrucao;

public class VerificaExercicios {
	public static void main(String[] args) {

		Exercicio exercicio = new Exercicio();
		
		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 1 ******************");

		JOptionPane.showMessageDialog(null, "Teste 0 ^ 2: " + exercicio.potencializacao(0, 2));
		JOptionPane.showMessageDialog(null, "Teste 12 ^ 0: " + exercicio.potencializacao(12, 0));
		JOptionPane.showMessageDialog(null, "Teste 2 ^ 4: " + exercicio.potencializacao(2, 4));

		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 2 ******************");
		Integer[] vetor = new Integer[5];
		exercicio.preencheVetor(vetor);
		exercicio.imprimeVetor(vetor);

		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 3 ******************");
		exercicio.mostraNumerosPares(vetor);

		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 5 ******************");
		String[] vetorNomes = new String[10];

		exercicio.preencherVetor(vetorNomes);
		JOptionPane.showMessageDialog(null, exercicio.busca(vetorNomes, JOptionPane.showInputDialog("Nome a Buscar: ")) ? "Encontrou o nome no vetor" : "Nome não existe no vetor");

		exercicio.imprimeVetor(vetorNomes);
	
		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 6 ******************");
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rodrigo");
		funcionario.setInstrucao(TipoInstrucao.POS_GRADUADO);
		funcionario.setMotorista(true);
		funcionario.setSalario(3500.00);
		
		JOptionPane.showMessageDialog(null, funcionario.toString());
		
		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 7 ******************");
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setNome("Rodrigo Sene");
		contaCorrente.setNumeroConta("13234234");
		
		contaCorrente.deposito(new BigDecimal("1000000"));
		contaCorrente.saque(new BigDecimal("1000"));
		JOptionPane.showMessageDialog(null, contaCorrente.toString());
		
		contaCorrente.saque(new BigDecimal("100000000"));
		contaCorrente.deposito(BigDecimal.ZERO);
		
		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 8 ******************");
		
		String opcao = new String();
		
		while(!opcao.equals("0")){
			
			String num1 = JOptionPane.showInputDialog("Primeiro Numero: ");
			String num2 = JOptionPane.showInputDialog("Segundo Numero: ");
			
			opcao = JOptionPane.showInputDialog("Qua opção deseja? (Digite o numero correspondente)"+
					"\n(1) Soma" +
					"\n(2) Subtração" +
					"\n(3) Multiplicação" +
					"\n(4) Divisão"+
					"\n(0) Cancelar");
			Operacoes operacoes = new Operacoes(new Long(num1), new Long(num2));
			if(opcao.equals("1")){
				JOptionPane.showMessageDialog(null, operacoes.soma());
			}else if(opcao.equals("2")){
				JOptionPane.showMessageDialog(null, operacoes.subtracao());
			}else if(opcao.equals("3")){
				JOptionPane.showMessageDialog(null, operacoes.multiplicacao());
			}else if(opcao.equals("4")){
				JOptionPane.showMessageDialog(null, operacoes.divisao());
			}
		}
		
		JOptionPane.showMessageDialog(null, "****************** EXERCICIO 9 ******************");
		Filme filme1 = new Filme();
		
		filme1.setTitulo("A Origem");
		filme1.setCodigo(1);
		filme1.setDirecao("Christopher Nolan");
		filme1.setDuracao(148);
		filme1.setGenero("Ficção Científica");
		
		JOptionPane.showMessageDialog(null, filme1.toString());
		
		Filme filme2 = new Filme();
		
		filme2.setTitulo("Seven: Os sete crimes capitais");
		filme2.setCodigo(2);
		filme2.setDirecao("David Fincher");
		filme2.setDuracao(130);
		filme2.setGenero("Suspense");
		
		JOptionPane.showMessageDialog(null, filme2.toString());
	}
}
