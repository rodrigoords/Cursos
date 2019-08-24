package cotuba.application;

import cotuba.domain.Ebook;
import cotuba.epub.GeradorEPUBComEpublib;

public interface GeradorEbook {

	void gera(Ebook ebook);
	
	public static GeradorEbook cria(String formato) {
		GeradorEbook gerador;
		
		if ("pdf".equals(formato)) {
			
			gerador = new GeradorEPUBComEpublib();
			
		} else if ("epub".equals(formato)) {
			
			gerador = new GeradorEPUBComEpublib();
			
		} else {
			throw new RuntimeException("Formato do ebook inválido: " + formato);
		}
		return gerador;
	};
}
