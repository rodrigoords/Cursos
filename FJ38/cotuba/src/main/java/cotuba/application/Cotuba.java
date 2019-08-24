package cotuba.application;

import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import cotuba.md.RenderizadorMDparaHTML;

public class Cotuba {
	
	public void executa(ParametrosCotuba parametrosCotuba) {
		RenderizadorMDparaHTML renderizadorMDparaHTML = RenderizadorMDparaHTML.cria();
		List<Capitulo> capitulos = renderizadorMDparaHTML.renderizar(parametrosCotuba.getDiretorioDosMD());
		
		Ebook ebook = new Ebook();
		
		ebook.setFormato(parametrosCotuba.getFormato());
		ebook.setArquivoDeSaida(parametrosCotuba.getArquivoDeSaida());
		ebook.setCapitulos(capitulos);

		GeradorEbook gerador = GeradorEbook.cria(parametrosCotuba.getFormato());
		gerador.gera(ebook);

	}
}
