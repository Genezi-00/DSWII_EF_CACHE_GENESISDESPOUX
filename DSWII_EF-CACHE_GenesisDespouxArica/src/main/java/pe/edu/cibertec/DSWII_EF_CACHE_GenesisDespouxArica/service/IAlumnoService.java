package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service;

import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Alumno;

import java.util.List;

public interface IAlumnoService {
    List<Alumno> obtenerAlumnosPorFechaNacimiento(String fechanacimiento);
}