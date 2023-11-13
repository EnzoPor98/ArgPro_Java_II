package Clase4;

/**
 * @author Enzo Portillo.
 */
public class EnAuge extends Popularidad {

    @Override
    public void mostrarInfo() {
        System.out.print("[" + Icono.ROCKET.texto() + "] ");
        System.out.println(cancion.getArtista() + " - "
                + cancion.getNombre() + " ("
                + cancion.getAlbum() + " - "
                + cancion.getAño() + ")");
    }

    @Override
    public void comprobarPopularidad() {
        if (cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000) {
            cancion.setPopularidad(new Tendencia());
        } else if (cancion.getDislikes() >= 5000) {
            cancion.setPopularidad(new Normal());
        }
    }
}
