package com.progreso.Progreso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progreso.Progreso.model.Progreso;
import com.progreso.Progreso.services.ProgresoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/v0/progreso")
public class ProgresoController {
    @Autowired
    private ProgresoService serviceProgreso;

    @GetMapping()
        public Progreso List<Progreso> Object obtenerProgreso() {
         return serviceProgreso.obtenerProgreso();
        }
    @PostMapping()
    public Progreso guardaProgreso(@RequestBody Progreso pro) {        
        return serviceProgreso.guardaProgreso(pro);
    }
    @GetMapping("{}")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    


    


}
