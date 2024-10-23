package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Alumno;
import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service.impl.AlumnoService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {
    private final AlumnoService alumnoService;

    @GetMapping("/fechaNacimiento/{fechaNacimiento}")
    public List<Alumno> obtenerAlumnosPorFechaNacimiento(@PathVariable("fechaNacimiento") String fechaNacimiento) {
        LocalDate fecha = LocalDate.parse(fechaNacimiento);
        return alumnoService.obtenerAlumnosPorFechaNacimiento(fecha);
    }
}