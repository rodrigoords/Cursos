package br.com.alura.thread.lista;

public class TarefaImprimeElementos implements Runnable {

	private Lista lista;

	public TarefaImprimeElementos(Lista lista) {
		this.lista = lista;
	}

	public void run() {
		
		synchronized (lista) {
			
			while(!lista.isCheia()){
				try {
					lista.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			for (int i = 0; i < lista.tamanho(); i++) {
				System.out.println(lista.pegaElemento(i));
			}
		}
		
	}

}
