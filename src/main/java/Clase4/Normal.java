package Clase4;

/**
 * @author Enzo Portillo.
 */
public class Normal extends Popularidad {

    @Override
    public void mostrarInfo() {
        System.out.print("[" + Icono.MUSICAL_NOTE.texto() + "] ");
        System.out.println(cancion.getArtista() + " - "
                + cancion.getAlbum() + " - "
                + cancion.getNombre() + ".");
    }

    @Override
    public void comprobarPopularidad() {
        if (cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000) {
            cancion.setPopularidad(new Tendencia());
        } else if (cancion.getReproducciones() > 1000) {
            cancion.setPopularidad(new EnAuge());
        }
    }
}
