package Clase2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enzo Portillo.
 */
public class Main extends Transformador {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();

        palabras.add("Uno");
        palabras.add("Dos");
        palabras.add("Tres");
        palabras.add("Cuatro");
        palabras.add("Cinco");
        palabras.add("Seis");
        palabras.add("Siete");
        palabras.add("Ocho");
        palabras.add("Nueve");
        palabras.add("Diez");

        palabras = new Transformador().transformar(palabras);
        palabras.stream().forEach(System.out::println);
    }

}
