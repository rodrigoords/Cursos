package br.com.alura.designerpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * o padrão flyweight ajuda o desenvolver a resolver problemas relacionados a objetos que não 
 * necessitam de mais de uma instancia. Por exemplo uma nota musical será sempre uma unica nota
 * não é necessário existir mais de uma instancia de nota.
 * @author Rodrigo Sene
 *
 */
public class NotasMusicaisSimples {
	/**
	 * O metodo simples implementa a lista com todas as notas já inicializando uma refenrencia 
	 * assim que a VM é iniciada, porem durante a execução do programa pode ser que não seja 
	 * utilizada algum nota.
	 */
	private static Map<String, Nota> notas = new HashMap<>();
	
	static{
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}
	
	public Nota getInstance(String nome){
		return notas.get(nome);
	}
}
