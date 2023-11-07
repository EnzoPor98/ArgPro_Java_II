package Clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Enzo Portillo.
 */
public class Punto1 {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        
        palabras.add("Argentina");
        palabras.add("Programa");
        palabras.add("Enzo");
        palabras.add("Ariel");
        palabras.add("Portillo");
        
        List<String> palabrasMayusculas = transformar(palabras);
        
        palabrasMayusculas.stream().forEach(System.out::println);
    }

    private static List<String> transformar(List<String> palabras) {
        return palabras.stream().map((x) -> x.toUpperCase()).collect(Collectors.toList());
    }
}
