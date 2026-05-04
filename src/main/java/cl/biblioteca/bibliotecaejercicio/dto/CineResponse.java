package cl.biblioteca.bibliotecaejercicio.dto;

public class CineResponse {

    private int id;
    private String nombrePelicula;
    private String generoPelicula;
    private int fechaEstrenoPelicula;
    private int duracionPelicula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public int getFechaEstrenoPelicula() {
        return fechaEstrenoPelicula;
    }

    public void setFechaEstrenoPelicula(int fechaEstrenoPelicula) {
        this.fechaEstrenoPelicula = fechaEstrenoPelicula;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }
    public void setDuracionPelicula(int duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }
    
}
