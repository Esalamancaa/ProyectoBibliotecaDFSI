package cl.biblioteca.bibliotecaejercicio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    
    private String editorial;
    private int fechaPublicacion;
    private String autor;

    

    public Libro(String autor, String editorial, int fechaPublicacion, int id, String isbn, String titulo) {
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
    }

}
