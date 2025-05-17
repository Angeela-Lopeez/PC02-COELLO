package com.tecsup.pc02spring.controller;

import com.tecsup.pc02spring.model.Medicamento;
import com.tecsup.pc02spring.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public List<Medicamento> listarTodos() {
        return medicamentoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicamento> obtenerPorId(@PathVariable Long id) {
        Medicamento medicamento = medicamentoService.obtenerPorId(id);
        if (medicamento == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(medicamento);
    }

    @PostMapping
    public Medicamento crear(@RequestBody Medicamento medicamento) {
        return medicamentoService.crear(medicamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicamento> actualizar(@PathVariable Long id, @RequestBody Medicamento medicamento) {
        medicamento.setCodMedicamento(id);
        Medicamento actualizado = medicamentoService.actualizar(medicamento);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        medicamentoService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}