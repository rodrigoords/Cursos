package br.com.alura.designerpatterns.flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicaisMelhorada {
	/**
	 * Esse metodo melhorado instancia e guarda uma instancia de nota conforme a necessidade, 
	 * caso uma nota nunca seja instanciada no programa, não será ocupado memória desnecessaria.
	 */
	private static Map<String, Nota> notas = new HashMap<>();
    private static List<Class<? extends Nota>> clazzes;

    static {
         clazzes = Arrays.asList(
                    Do.class, Re.class, Mi.class, Fa.class, 
                    Sol.class, La.class, Si.class);
    }

    public Nota getInstance(String nome) {
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().equalsIgnoreCase(nome)) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
