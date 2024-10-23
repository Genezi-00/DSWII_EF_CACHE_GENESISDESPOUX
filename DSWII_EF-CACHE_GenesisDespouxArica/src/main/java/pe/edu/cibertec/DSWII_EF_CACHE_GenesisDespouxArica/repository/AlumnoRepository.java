package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Alumno;

import java.time.LocalDate;
import java.util.List;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

    @Query("SELECT a FROM Alumno a WHERE a.fechanacimiento = :fechanacimiento")
    List<Alumno> obtenerAlumnosPorFechaNacimiento(@Param("fechanacimiento") LocalDate fechaNacimiento);
}