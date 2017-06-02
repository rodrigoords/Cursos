package br.com.alura.designerpatterns.bridge;

public class MapLink implements Mapa{

	@Override
	public String devolveMapa(String endereco) {
		// lógica para buscar o mapa do MapLink
		return "Mapa mapLink";
	}

}
