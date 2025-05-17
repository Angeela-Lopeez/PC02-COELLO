package com.tecsup.pc02spring.model;

import jakarta.persistence.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Medicamento")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMedicamento;

    @Column(nullable = false, length = 255)
    private String descripcionMed;

    private Date fechaFabricacion;
    private Date fechaVencimiento;
    private String presentacion;
    private Integer stock;
    private Double precioVentaUni;
    private Double precioVentaPres;
    private String marca;
    private Long codEspec;

    @ManyToOne
    @JoinColumn(name = "codTipoMed")
    @JsonIgnoreProperties("medicamentos")
    private TipoMedic tipoMedic;

    // Getters y Setters
    public Long getCodMedicamento() {
        return codMedicamento;
    }

    public void setCodMedicamento(Long codMedicamento) {
        this.codMedicamento = codMedicamento;
    }

    public String getDescripcionMed() {
        return descripcionMed;
    }

    public void setDescripcionMed(String descripcionMed) {
        this.descripcionMed = descripcionMed;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecioVentaUni() {
        return precioVentaUni;
    }

    public void setPrecioVentaUni(Double precioVentaUni) {
        this.precioVentaUni = precioVentaUni;
    }

    public Double getPrecioVentaPres() {
        return precioVentaPres;
    }

    public void setPrecioVentaPres(Double precioVentaPres) {
        this.precioVentaPres = precioVentaPres;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getCodEspec() {
        return codEspec;
    }

    public void setCodEspec(Long codEspec) {
        this.codEspec = codEspec;
    }

    public TipoMedic getTipoMedic() {
        return tipoMedic;
    }

    public void setTipoMedic(TipoMedic tipoMedic) {
        this.tipoMedic = tipoMedic;
    }
}