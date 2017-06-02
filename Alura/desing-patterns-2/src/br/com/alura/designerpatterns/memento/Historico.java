package br.com.alura.designerpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * O padrão memento posibilita buscar dados de momentos anteriores do seu objeto, para isso ele guarda
 * esses momentos em uma lista.
 * @author Rodrigo Sene
 *
 */
public class Historico {
	
	/**
	 * A classe estado serve como um ferramenta para encapsular o estado, 
	 * caso exista algum tipo de regra ou informações referentes unicamente
	 *  ao estado e não ao contrato guardamos nessa classe, caso não exista 
	 *  uma regra especifica do estado podemos guardar diretamente o 
	 *  contrato dentro do historico
	 */
	private List<Estado> historicoDeEstado = new ArrayList<>();
	
	public Estado resgata(int index){
		return historicoDeEstado.get(index);
	}
	
	public void inclui(Estado estado){
		historicoDeEstado.add(estado);
	}
}
