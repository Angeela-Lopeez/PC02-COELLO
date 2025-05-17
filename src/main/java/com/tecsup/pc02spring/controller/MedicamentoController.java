package com.tecsup.pc02spring.controller;

import com.tecsup.pc02spring.model.Medicamento;
import com.tecsup.pc02spring.service.MedicamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {

    private final MedicamentoService medicamentoService;

    public MedicamentoController(MedicamentoService medicamentoService) {
        this.medicamentoService = medicamentoService;
    }

    @GetMapping
    public List<Medicamento> getAll() {
        return medicamentoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicamento> getById(@PathVariable Long id) {
        Medicamento medicamento = medicamentoService.getById(id);
        if (medicamento == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(medicamento);
    }

    @PostMapping
    public Medicamento create(@RequestBody Medicamento medicamento) {
        return medicamentoService.save(medicamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicamento> update(@PathVariable Long id, @RequestBody Medicamento medicamento) {
        Medicamento existing = medicamentoService.getById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        existing.setDescripcionMed(medicamento.getDescripcionMed());
        existing.setFechaFabricacion(medicamento.getFechaFabricacion());
        existing.setFechaVencimiento(medicamento.getFechaVencimiento());
        existing.setPresentacion(medicamento.getPresentacion());
        existing.setStock(medicamento.getStock());
        existing.setPrecioVentaUni(medicamento.getPrecioVentaUni());
        existing.setPrecioVentaPres(medicamento.getPrecioVentaPres());
        existing.setMarca(medicamento.getMarca());
        existing.setCodEspec(medicamento.getCodEspec());
        existing.setTipoMedic(medicamento.getTipoMedic());
        return ResponseEntity.ok(medicamentoService.save(existing));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Medicamento existing = medicamentoService.getById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        medicamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}