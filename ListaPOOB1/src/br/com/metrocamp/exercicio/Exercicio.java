package br.com.metrocamp.exercicio;

import javax.swing.JOptionPane;

public class Exercicio {

	public double potencializacao(double base, double potencia) {
		return Math.pow(base, potencia);
	}

	/***
	 * Metódo que tem como responsabilidade solicitar ao usuario os valores para guardar em um vetor de Inteiros
	 * @param vetor
	 */
	public void preencheVetor(Integer[] vetor) {
		if(vetor == null)
			return;
		for (Integer i = 0; i < vetor.length; i++) {
			String valor = JOptionPane.showInputDialog(null, "Digite o valor numérico para posição " + (i + 1) + " do vetor : ");
			vetor[i] = Integer.valueOf(valor);
		}
	}
	
	/***
	 * Metódo que tem como responsabilidade solicitar ao usuario os valores para guardar em um vetor de String.
	 * @param vetor
	 */
	public void preencherVetor(String[] vetor){
		if (vetor == null)
			return;
		for (Integer i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog(null, "Digite o nome para posição " + (i + 1) + " do vetor : ");
		}
	}
	
	public boolean busca(String[] vetor, String nome){
		boolean retorno = false;
		
		for (String string : vetor) {
			if(string.equals(nome))
				return true;
		}
		return retorno;
	}
	
	public void mostraNumerosPares(Integer[] vetor){
		if(vetor == null)
			return;
		System.out.println("Mostrando os numeros pares do vetor: ");
		for (Integer integer : vetor) {
			if(integer%2 == 0){
				System.out.println(integer);
			}
		}
	}
	
	public void imprimeVetor(Integer[] vetor) {
		if(vetor == null){
			System.out.println("Vetor Vazio");
			return;
		}
		System.out.println("Imprimindo vetor: ");
		for (Integer integer : vetor) {
			System.out.println(integer);
		}
	}
	
	public void imprimeVetor(String[] vetor){
		if(vetor == null){
			System.out.println("Vetor Vazio");
			return;
		}
		System.out.println("Imprimindo vetor: ");
		for (String string : vetor) {
			System.out.println(string);
		}
	}
}
