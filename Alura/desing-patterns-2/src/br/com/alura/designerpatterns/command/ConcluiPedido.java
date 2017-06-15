package br.com.alura.designerpatterns.command;

public class ConcluiPedido implements Command{
	
	private Pedido pedido;
	public ConcluiPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public void execute() {
		pedido.concluir();
	}

}
