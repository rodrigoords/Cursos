package br.com.alura.modelo;

public class Banheiro {
	
	public void fazNumero1() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " Bateu na porta");
		
		synchronized (this) {
			
			System.out.println(name + " Entrou no banheiro");
			System.out.println(name + " Fazendo numero 1");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Dando descarga");
			System.out.println(name + " Lavando as mãos");
			System.out.println(name + " Saindo");
			
		}

	}
	
	public void fazNumero2(){
		String name = Thread.currentThread().getName();
		System.out.println(name + " Bateu na porta");
		synchronized (this) {
			
			System.out.println(name + " Entrou no banheiro");
			System.out.println(name + " Fazendo numero 2");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Dando descarga");
			System.out.println(name + " Lavando as mãos");
			System.out.println(name + " Saindo");
			
		}
	}
}
