package br.com.alura.designerpatterns.command;

import java.time.LocalDate;

public class Pedido {
	
	private Status status;
	private LocalDate dataCriacao;
	private String cliente;

	public Pedido(String cliente) {
		this.cliente = cliente;
		this.dataCriacao = LocalDate.now();
		this.status = Status.NOVO;
	}
	
	public void concluir(){
		this.status = Status.CONCLUIDO;
	}
	
	public void pagar(){
		this.status = Status.PAGO;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
