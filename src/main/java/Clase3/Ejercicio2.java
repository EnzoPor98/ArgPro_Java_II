package Clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Enzo Portillo.
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        int caracteres = 5;
        
        palabras.add("Juan");
        palabras.add("Pablo");
        palabras.add("Enzo");
        palabras.add("Ariel");
        palabras.add("Matias");
        palabras.add("Agustin");
        palabras.add("Paola");
        palabras.add("Andrea");
        
        String palabrasObtenidas = obtenerPalabras(palabras, caracteres);
        
        System.out.println(palabrasObtenidas);
    }
    
    private static String obtenerPalabras(List<String> palabras, int caracteres) {
        String resultado = palabras.stream().filter((x)->x.length()>=caracteres).collect(Collectors.joining(", "));
        return resultado;
    }
}
