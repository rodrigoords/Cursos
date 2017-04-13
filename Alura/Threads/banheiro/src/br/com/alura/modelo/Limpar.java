package br.com.alura.modelo;

public class Limpar implements Runnable {

	private Banheiro banheiro;

	public Limpar(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		while(true){			
			banheiro.limpar();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
