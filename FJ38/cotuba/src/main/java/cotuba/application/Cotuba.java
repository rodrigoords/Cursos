package cotuba.application;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import cotuba.epub.GeradorEPUB;
import cotuba.md.RenderizadorMDparaHTML;
import cotuba.pdf.GeradorPDF;

public class Cotuba {
	
	public void executa(String formato, Path diretorioDosMD, Path arquivoDeSaida) {
		RenderizadorMDparaHTML renderizadorMDparaHTML = new RenderizadorMDparaHTML();
		List<Capitulo> capitulos = renderizadorMDparaHTML.renderizar(diretorioDosMD);
		
		Ebook ebook = new Ebook();
		
		ebook.setFormato(formato);
		ebook.setArquivoDeSaida(arquivoDeSaida);
		ebook.setCapitulos(capitulos);

		if ("pdf".equals(formato)) {
			GeradorPDF geradorPDF = new GeradorPDF();
			geradorPDF.gera(ebook);

		} else if ("epub".equals(formato)) {
			GeradorEPUB geradorEPUB = new GeradorEPUB();
			geradorEPUB.gera(ebook);
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}

	}
}
