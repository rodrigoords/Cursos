package cotuba;

import java.nio.file.Path;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		LeitorOpcoesCLI leitorOpcoesCLI = new LeitorOpcoesCLI(args);
		Path diretorioDosMD = leitorOpcoesCLI.getDiretorioDosMD();
		String formato = leitorOpcoesCLI.getFormato();
		Path arquivoDeSaida = leitorOpcoesCLI.getArquivoDeSaida();
		boolean modoVerboso = leitorOpcoesCLI.isModoVerboso();
		RenderizadorMDparaHTML renderizadorMDparaHTML = new RenderizadorMDparaHTML();
		List<Capitulo> capitulos = renderizadorMDparaHTML.renderizar(diretorioDosMD);
		
		Ebook ebook = new Ebook();
		
		ebook.setFormato(formato);
		ebook.setArquivoDeSaida(arquivoDeSaida);
		ebook.setCapitulos(capitulos);

		try {

			if ("pdf".equals(formato)) {
				GeradorPDF geradorPDF = new GeradorPDF();
				geradorPDF.gera(ebook);

			} else if ("epub".equals(formato)) {
				GeradorEPUB geradorEPUB = new GeradorEPUB();
				geradorEPUB.gera(ebook);
			} else {
				throw new RuntimeException("Formato do ebook inválido: " + formato);
			}

			System.out.println("Arquivo gerado com sucesso: " + arquivoDeSaida);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			if (modoVerboso) {
				ex.printStackTrace();
			}
			System.exit(1);
		}
	}

}
