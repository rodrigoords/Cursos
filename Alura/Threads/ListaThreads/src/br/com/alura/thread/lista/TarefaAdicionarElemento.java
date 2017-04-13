package br.com.alura.thread.lista;

public class TarefaAdicionarElemento implements Runnable {

	private Lista lista;
	private int numeroThread;

	public TarefaAdicionarElemento( Lista lista) {
		this.lista = lista;
	}

	public void run() {
		
		for (int i = 0; i < 100; i++) {
			this.lista.adicionaElementos("Thread " + numeroThread + " - "+i);
		}
		
	}

}
