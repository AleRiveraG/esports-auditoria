package com.auditoria.microservicio_auditoria.repository;

import com.auditoria.microservicio_auditoria.model.Auditoria;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuditoriaRepository {

    private List<Auditoria> listaAuditoria = new ArrayList<>();

    public List<Auditoria> obtenerTodos(){
        return listaAuditoria;
    }

    public Auditoria buscarPorId(Long id){
        for(Auditoria auditoria: listaAuditoria){
            if(auditoria.getIdAuditoria().equals(id)){
                return auditoria;
            }
        }
        return null;
    }
    public Auditoria generarAuditoria(Auditoria auditoria){
        listaAuditoria.add(auditoria);
        return auditoria;
    }




}
