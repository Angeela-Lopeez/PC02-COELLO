package com.tecsup.pc02spring.controller;

import com.tecsup.pc02spring.model.TipoMedic;
import com.tecsup.pc02spring.service.TipoMedicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tipos-medic")
public class TipoMedicController {

    @Autowired
    private TipoMedicService tipoMedicService;

    @GetMapping
    public List<TipoMedic> listarTodos() {
        return tipoMedicService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoMedic> obtenerPorId(@PathVariable Long id) {
        TipoMedic tipoMedic = tipoMedicService.obtenerPorId(id);
        if (tipoMedic == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tipoMedic);
    }

    @PostMapping
    public TipoMedic crear(@RequestBody TipoMedic tipoMedic) {
        return tipoMedicService.crear(tipoMedic);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoMedic> actualizar(@PathVariable Long id, @RequestBody TipoMedic tipoMedic) {
        tipoMedic.setCodTipoMed(id);
        TipoMedic actualizado = tipoMedicService.actualizar(tipoMedic);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        tipoMedicService.eliminar(id);
        return ResponseEntity.ok().build();
    }
}