package br.com.alura.designerpatterns.bridge;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String endereco) {
		// Lógica para buscar o mapa do google 
		return "mapa Google Maps";
	}

}
