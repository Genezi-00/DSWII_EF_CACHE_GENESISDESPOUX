package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service;

import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    List<Asignatura> obtenerAsignaturasPorCurso(int cursoId);
}