package Clase1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enzo Portillo.
 */
public class Alumno {

    private String nombre;
    private String dni;
    private List<Materia> aprobadas = new ArrayList<>();

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // ------------------------------------------------------ GETTERS & SETTERS.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(Materia aprobada) {
        aprobadas.add(aprobada);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
