package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Asignatura;

import java.util.List;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {

    @Query("SELECT a FROM Asignatura a WHERE a.curso.id = :cursoId")
    List<Asignatura> obtenerAsignaturasPorCurso(@Param("cursoId") int cursoId);
}