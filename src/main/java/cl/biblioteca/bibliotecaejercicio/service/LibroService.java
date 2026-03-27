package cl.biblioteca.bibliotecaejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.biblioteca.bibliotecaejercicio.model.Libro;
import cl.biblioteca.bibliotecaejercicio.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "producto eliminado";
    }

    public int totalLibros(){
        return libroRepository.totalLibros();
    }

    public Libro getLibroIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }
}

