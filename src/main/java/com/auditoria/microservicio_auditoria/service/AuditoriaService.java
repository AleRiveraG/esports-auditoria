package com.auditoria.microservicio_auditoria.service;

import com.auditoria.microservicio_auditoria.model.Auditoria;
import com.auditoria.microservicio_auditoria.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriaService {

    @Autowired
    private AuditoriaRepository auditoriaRepository;

    public List<Auditoria> obtenerTodos(){
        return auditoriaRepository.obtenerTodos();
    }

    public Auditoria buscarPorId(Long id){
        return auditoriaRepository.buscarPorId(id);
    }

    public Auditoria generarAuditoria(Auditoria auditoria){
        return auditoriaRepository.generarAuditoria(auditoria);
    }
}
