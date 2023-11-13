package Clase4;

/**
 * @author Enzo Portillo.
 */
public class Tendencia extends Popularidad {

    @Override
    public void mostrarInfo() {
        System.out.print("[" + Icono.FIRE.texto() + "] ");
        System.out.println(cancion.getNombre() + " - "
                + cancion.getArtista() + " ("
                + cancion.getAlbum() + " - "
                + cancion.getAño() + ")");
    }

    @Override
    public void comprobarPopularidad() {
        if (cancion.getUltReproHace() > 24) {
            cancion.setPopularidad(new Normal());
        }
    }
}
