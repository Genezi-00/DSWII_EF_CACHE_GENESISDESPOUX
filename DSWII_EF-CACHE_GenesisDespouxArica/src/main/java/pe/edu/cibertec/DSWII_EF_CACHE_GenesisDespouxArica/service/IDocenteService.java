package pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.service;

import pe.edu.cibertec.DSWII_EF_CACHE_GenesisDespouxArica.model.Docente;

public interface IDocenteService {
    Docente obtenerDocentePorDni(String dni);
}