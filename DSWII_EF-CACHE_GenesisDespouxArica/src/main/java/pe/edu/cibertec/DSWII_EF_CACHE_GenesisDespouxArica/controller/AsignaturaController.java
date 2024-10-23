package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Asignatura;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service.impl.AsignaturaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/asignaturas")
public class AsignaturaController {
    private final AsignaturaService asignaturaService;

    @GetMapping("/curso/{cursoId}")
    public List<Asignatura> obtenerAsignaturasPorCurso(@PathVariable("cursoId") int cursoId) {
        return asignaturaService.obtenerAsignaturasPorCurso(cursoId);
    }
}