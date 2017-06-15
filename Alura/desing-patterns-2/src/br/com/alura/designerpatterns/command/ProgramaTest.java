package br.com.alura.designerpatterns.command;

public class ProgramaTest {
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("Rodrigo Sene");
		Pedido pedido2 = new Pedido("Gabriel Sene");
		
		FilaDeAcoes filaDeAcoes = new FilaDeAcoes();
		
		filaDeAcoes.adiciona(new PagaPedido(pedido1));
		filaDeAcoes.adiciona(new ConcluiPedido(pedido2));
		
		filaDeAcoes.processa();
	}
}
