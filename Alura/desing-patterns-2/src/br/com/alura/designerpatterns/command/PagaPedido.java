package br.com.alura.designerpatterns.command;

public class PagaPedido implements Command{
	
	private Pedido pedido;
	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public void execute() {
		pedido.pagar();
	}

}
