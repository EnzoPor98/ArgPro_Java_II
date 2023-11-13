package Clase4;

/**
 * @author Enzo Portillo.
 */
public class Main {

    public static void main(String[] args) {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", "2002");

        // PRUEBA Nº1: CANCIÓN RECIÉN LANZADA.
        cancion.mostrarDetalles();

        // PRUEBA Nº2: EN AUGE POR SUPERAR REPRODUCCIONES ESPERADAS.
        cancion.setReproducciones(2000);
        cancion.mostrarDetalles();

        // PRUEBA Nº3: BAJA DEL AUGE POR DISLIKES.
        cancion.setDislikes(6000);
        cancion.mostrarDetalles();

        // PRUEBA Nº4: ES TENDENCIA SUPERAR POR REPRODUCCIONES Y LIKES.
        cancion.setReproducciones(55000);
        cancion.setLikes(23000);
        cancion.mostrarDetalles();

        // PRUEBA Nº5: BAJA A NORMAL POR NO SER ESCUCHADA LAS ULTIMAS 24 HORAS.
        cancion.setUltReproHace(30);
        cancion.mostrarDetalles();
    }
}
