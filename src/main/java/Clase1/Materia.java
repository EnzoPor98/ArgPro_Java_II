package Clase1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enzo Portillo.
 */
public class Materia {

    private String nombre;
    private boolean inscripto = false;
    private List<Materia> correlativas = new ArrayList<>();

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    // ------------------------------------------------------ GETTERS & SETTERS.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(Materia correlativa) {
        correlativas.add(correlativa);
    }

    public boolean isInscripto() {
        return inscripto;
    }

    public void setinscripto(boolean inscripto) {
        this.inscripto = inscripto;
    }
}
