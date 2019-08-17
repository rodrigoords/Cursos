package cotuba.cli;

import java.nio.file.Path;

import cotuba.application.Cotuba;

public class Main {

	public static void main(String[] args) {


		LeitorOpcoesCLI leitorOpcoesCLI = new LeitorOpcoesCLI(args);
		Path diretorioDosMD = leitorOpcoesCLI.getDiretorioDosMD();
		String formato = leitorOpcoesCLI.getFormato();
		Path arquivoDeSaida = leitorOpcoesCLI.getArquivoDeSaida();
		boolean modoVerboso = leitorOpcoesCLI.isModoVerboso();

		try {
			Cotuba cotuba = new Cotuba();
			cotuba.executa(formato, diretorioDosMD, arquivoDeSaida);
			
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
