package cl.biblioteca.bibliotecaejercicio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.biblioteca.bibliotecaejercicio.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

    default int totalLibros(){
        return (int) this.count();
    }

    // Consulta nativa simple
    @Query(value = "SELECT * FROM libros WHERE autor = :autor", nativeQuery = true)
    List <Libro> findByAutor(@Param("autor") String autor);
}


    
    