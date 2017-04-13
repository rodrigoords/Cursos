package br.com.alura.modelo;

public class Banheiro {

	private Boolean isSujo = true;

	public void fazNumero1() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " Bateu na porta");

		synchronized (this) {

			System.out.println(name + " Entrou no banheiro");

			while (isSujo) {
				esperaLaFora(name);
			}

			System.out.println(name + " Fazendo numero 1");
			
			dorme(5000L);
			isSujo = true;
			
			System.out.println(name + " Dando descarga");
			System.out.println(name + " Lavando as mãos");
			System.out.println(name + " Saindo");

		}

	}

	public void fazNumero2() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Bateu na porta");
		synchronized (this) {

			System.out.println(name + " Entrou no banheiro");

			while (isSujo) {
				esperaLaFora(name);
			}

			System.out.println(name + " Fazendo numero 2");
			dorme(10000L);
			
			isSujo = true;
			
			System.out.println(name + " Dando descarga");
			System.out.println(name + " Lavando as mãos");
			System.out.println(name + " Saindo");

		}
	}

	public void limpar() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome +" Bateu na porta");

		synchronized (this) {
			System.out.println(nome + " Entrou no banheiro");

			if (!isSujo) {
				System.err.println(nome + " Banheiro limpo, saindo");
				return;
			}

			System.out.println(nome + " Limpando o banheiro");
			dorme(10000L);
			this.isSujo = false;
			this.notifyAll();
			System.out.println(nome + " Saindo do banheiro");
		}
	}

	private void esperaLaFora(String nome) {
		try {
			System.out.println(nome + " eca, banheiro sujo.");
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void dorme(Long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
