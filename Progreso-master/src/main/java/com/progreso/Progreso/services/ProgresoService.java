package com.progreso.Progreso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progreso.Progreso.model.Progreso;
import com.progreso.Progreso.repository.ProgresoRepository;

@Service
public class ProgresoService {
    @Autowired
    private ProgresoRepository progresoRepository;


    public List <Progreso>getProgresos() {
        return ProgresoRepository.obtenerProgreso();
     }

    public Progreso guardaProgreso(Progreso pro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardaProgreso'");
    }

}
