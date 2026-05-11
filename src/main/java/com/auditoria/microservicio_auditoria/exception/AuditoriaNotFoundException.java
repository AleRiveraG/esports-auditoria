package com.auditoria.microservicio_auditoria.exception;


public class AuditoriaNotFoundException extends RuntimeException{

    public AuditoriaNotFoundException(String mensaje){
        super(mensaje);
    }
}
