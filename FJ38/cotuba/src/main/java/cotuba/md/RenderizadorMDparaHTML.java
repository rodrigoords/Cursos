package cotuba.md;

import java.nio.file.Path;
import java.util.List;

import cotuba.domain.Capitulo;

public interface RenderizadorMDparaHTML {

	List<Capitulo> renderizar(Path diretorioDosMD);
	
	public static RenderizadorMDparaHTML cria() {
		return new RenderizadorMDparaHTMLComCommonMark();
	}
}