package br.com.alura.designerpatterns.adapter;

import java.util.Calendar;

/**
 * O Padrão adpter tem como principal objetivo criar uma estrutura que esconda regras
 * complexas de código já existendes e facilite a utilização do mesmo, adaptando as 
 * necessidades do sistema.
 * @author Rodrigo Sene
 *
 */
public interface Relogio {
	public Calendar hoje();
}
