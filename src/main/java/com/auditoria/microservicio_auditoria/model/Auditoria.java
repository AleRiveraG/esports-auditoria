package com.auditoria.microservicio_auditoria.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auditoria {

    @NotNull(message = "El id de la auditoria no puede ser nulo")
    @Positive(message = "El id de la auditoria tiene que ser mayor a 0")
    private Long idAuditoria;

    @NotNull(message = "El id del usuario no puede ser nulo")
    @Positive(message = "El id del usuario tiene que ser mayor a 0")
    private Long idUsuario;

    @NotBlank(message = "El detalle no puede ser vacio ni nulo")
    private String detalle;

    @NotNull(message = "La fecha no puede ser nula")
    private LocalDate fecha;




}
