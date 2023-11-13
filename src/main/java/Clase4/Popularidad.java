package Clase4;

/**
 * @author Enzo Portillo.
 */
public abstract class Popularidad {

    public Cancion cancion;

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public abstract void mostrarInfo();

    public abstract void comprobarPopularidad();
}
