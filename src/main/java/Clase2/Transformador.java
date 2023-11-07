package Clase2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Enzo Portillo.
 */
public class Transformador implements InterfazFuncional {

    @Override
    public List<String> transformar(List<String> lista) {
        return lista.stream().map((x) -> x.toUpperCase()).collect(Collectors.toList());
    }

}
