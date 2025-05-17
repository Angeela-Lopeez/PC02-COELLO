package com.tecsup.pc02spring.controller;

import com.tecsup.pc02spring.model.TipoMedic;
import com.tecsup.pc02spring.service.TipoMedicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipomedic")
public class TipoMedicController {

    private final TipoMedicService tipoMedicService;

    public TipoMedicController(TipoMedicService tipoMedicService) {
        this.tipoMedicService = tipoMedicService;
    }

    @GetMapping
    public List<TipoMedic> getAll() {
        return tipoMedicService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoMedic> getById(@PathVariable Long id) {
        TipoMedic tipoMedic = tipoMedicService.getById(id);
        if (tipoMedic == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tipoMedic);
    }

    @PostMapping
    public TipoMedic create(@RequestBody TipoMedic tipoMedic) {
        return tipoMedicService.save(tipoMedic);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoMedic> update(@PathVariable Long id, @RequestBody TipoMedic tipoMedic) {
        TipoMedic existing = tipoMedicService.getById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        existing.setDescripcion(tipoMedic.getDescripcion());
        return ResponseEntity.ok(tipoMedicService.save(existing));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        TipoMedic existing = tipoMedicService.getById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        tipoMedicService.delete(id);
        return ResponseEntity.noContent().build();
    }
}