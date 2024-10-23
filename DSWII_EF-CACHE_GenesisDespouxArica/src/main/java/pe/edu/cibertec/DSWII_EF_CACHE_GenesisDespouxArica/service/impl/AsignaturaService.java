package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Asignatura;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.repository.AsignaturaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AsignaturaService {

    private final AsignaturaRepository asignaturaRepository;

    @Cacheable(value = "asignaturasPorCurso", key = "#cursoId")
    public List<Asignatura> obtenerAsignaturasPorCurso(int cursoId) {
        return asignaturaRepository.obtenerAsignaturasPorCurso(cursoId);
    }
}