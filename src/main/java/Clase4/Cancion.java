package Clase4;

/**
 * @author Enzo Portillo.
 */
public class Cancion {

    private String nombre;
    private String artista;
    private String album;
    private String año;
    private Popularidad popularidad;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private int ultReproHace;

    public Cancion(String nombre, String artista, String album, String año) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.año = año;
        popularidad = new Normal();
        popularidad.setCancion(this);
    }

    //
    public void mostrarDetalles() {
        popularidad.comprobarPopularidad();
        popularidad.setCancion(this);
        popularidad.mostrarInfo();
    }

    // ------------------------------------------------------ GETTERS Y SETTERS.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getUltReproHace() {
        return ultReproHace;
    }

    public void setUltReproHace(int ultReproHace) {
        this.ultReproHace = ultReproHace;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}
