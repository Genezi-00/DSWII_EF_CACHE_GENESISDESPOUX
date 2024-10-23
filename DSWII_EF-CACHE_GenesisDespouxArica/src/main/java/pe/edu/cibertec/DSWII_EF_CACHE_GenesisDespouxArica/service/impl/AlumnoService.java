package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Alumno;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.repository.AlumnoRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    @Cacheable(value = "alumnosPorFechaNacimiento", key = "#fechanacimiento")
    public List<Alumno> obtenerAlumnosPorFechaNacimiento(LocalDate fechanacimiento) {
        return alumnoRepository.obtenerAlumnosPorFechaNacimiento(fechanacimiento);
    }
}
