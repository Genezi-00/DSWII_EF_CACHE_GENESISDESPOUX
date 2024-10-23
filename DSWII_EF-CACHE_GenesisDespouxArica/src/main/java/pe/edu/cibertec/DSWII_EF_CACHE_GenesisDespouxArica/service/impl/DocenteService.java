package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service.impl;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Docente;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.repository.DocenteRepository;

@Service
@RequiredArgsConstructor
public class DocenteService {
    private final DocenteRepository docenteRepository;

    @Cacheable(value = "docentePorDni", key = "#dni")
    public Docente obtenerDocentePorDni(String dni) {
        return docenteRepository.obtenerDocentePorDni(dni);
    }
}