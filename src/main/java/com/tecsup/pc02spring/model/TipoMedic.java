package com.tecsup.pc02spring.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TipoMedic")
public class TipoMedic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codTipoMed;

    @Column(nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "tipoMedic", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Medicamento> medicamentos;

    // Getters y setters
    public Long getCodTipoMed() { return codTipoMed; }
    public void setCodTipoMed(Long codTipoMed) { this.codTipoMed = codTipoMed; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<Medicamento> getMedicamentos() { return medicamentos; }
    public void setMedicamentos(List<Medicamento> medicamentos) { this.medicamentos = medicamentos; }
}