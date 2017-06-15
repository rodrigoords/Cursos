package br.com.alura.designerpatterns.command;

import java.util.List;

public class FilaDeAcoes {
	

	private List<Command> comandos;

	public void adiciona(Command comando) {
		this.comandos.add(comando);
	}
	
	public void processa(){
		comandos.forEach(comando -> comando.execute());
	}
}
