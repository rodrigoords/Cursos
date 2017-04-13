package br.com.alura.thread.lista;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		Lista lista = new Lista();

		new Thread(new TarefaAdicionarElemento(lista)).start();

		new Thread(new TarefaImprimeElementos(lista)).start();
	}
}
