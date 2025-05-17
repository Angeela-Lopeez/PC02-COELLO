package com.tecsup.pc02spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoMedic")
public class TipoMedic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codTipoMed;

    @Column(nullable = false, length = 100)
    private String descripcion;

    // Getters y Setters
    public Long getCodTipoMed() {
        return codTipoMed;
    }

    public void setCodTipoMed(Long codTipoMed) {
        this.codTipoMed = codTipoMed;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}