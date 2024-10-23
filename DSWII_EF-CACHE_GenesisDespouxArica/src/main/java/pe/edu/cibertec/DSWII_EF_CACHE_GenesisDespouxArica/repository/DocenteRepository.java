package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

    @Query("SELECT d FROM Docente d WHERE d.dni = :dni")
    Docente obtenerDocentePorDni(@Param("dni") String dni);
}