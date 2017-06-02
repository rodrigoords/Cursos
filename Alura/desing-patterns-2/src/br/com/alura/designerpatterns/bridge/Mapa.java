package br.com.alura.designerpatterns.bridge;

/**
 * O Padrão de projeto Bridge proporciona de forma simples criar um acesso a classes e 
 * lógicas de sistemas negados, encapsulando a complexidade dessas classes.
 * É criada uma ponte entre o legado e o sistema.
 * @author Rodrigo Sene
 *
 */
public interface Mapa {
	String devolveMapa(String endereco);
}
