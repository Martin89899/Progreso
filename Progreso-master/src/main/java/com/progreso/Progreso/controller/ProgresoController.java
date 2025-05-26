package com.progreso.Progreso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progreso.Progreso.model.Progreso;
import com.progreso.Progreso.services.ProgresoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/v0/progreso")
public class ProgresoController {
    @Autowired
    private ProgresoService progresoService;

    @GetMapping()
    public List<Progreso>  obtenerProgreso(){
        return progresoService.obtenerProgreso();
    }
    @PostMapping()
        public Progreso guardar(@RequestBody Progreso pro){        
            return progresoService.guardaProgreso(pro);
    }
    @GetMapping("{idEstudiante}")
    public Progreso buscaProgreso(@PathVariable int idEstudiante) {
        return progresoService.getProgresos(idEstudiante);
    }
    @PutMapping("{idEstudiante}")
    public Progreso actualizarProgreso(@PathVariable int idEstudiante, @RequestBody Progreso pro){       
        pro.setIdEstudiante(idEstudiante); 
        return progresoService.actualizarProgreso(pro);
    }
    @DeleteMapping("{idEstudiante}")
        public String eliminarProgreso(@PathVariable int idEstudiante){
            return progresoService.eliminarProgreso(idEstudiante);


    }
    @GetMapping("mejor-estudiante")
    public ResponseEntity<?> obtenerMejorEstudiante() {
    Progreso mejor = progresoService.obtenerTopNota();
    if (mejor == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay estudiantes registrados.");
    }
    return ResponseEntity.ok(mejor);
}


    
    
}
