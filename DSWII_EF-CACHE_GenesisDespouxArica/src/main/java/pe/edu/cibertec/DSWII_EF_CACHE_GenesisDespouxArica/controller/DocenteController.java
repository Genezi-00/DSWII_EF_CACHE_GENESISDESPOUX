package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Docente;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service.impl.DocenteService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/docentes")
public class DocenteController {
    private final DocenteService docenteService;

    @GetMapping("/dni/{dni}")
    public Docente obtenerDocentePorDni(@PathVariable("dni") String dni) {
        return docenteService.obtenerDocentePorDni(dni);
    }
}