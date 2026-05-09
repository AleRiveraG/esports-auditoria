package com.auditoria.microservicio_auditoria.controller;


import com.auditoria.microservicio_auditoria.model.Auditoria;
import com.auditoria.microservicio_auditoria.service.AuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditoria")
public class AuditoriaController {

    @Autowired
    private AuditoriaService auditoriaService;

    @GetMapping
    public List<Auditoria> obtenerTodos(){
        return auditoriaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Auditoria buscarPorId(@PathVariable Long id){
        return auditoriaService.buscarPorId(id);
    }

    @PostMapping
    public Auditoria generarAuditoria(@RequestBody Auditoria auditoria){
        return auditoriaService.generarAuditoria(auditoria);
    }

}
