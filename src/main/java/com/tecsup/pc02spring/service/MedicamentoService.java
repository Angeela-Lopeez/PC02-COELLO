package com.tecsup.pc02spring.service;

import com.tecsup.pc02spring.model.Medicamento;
import java.util.List;

public interface MedicamentoService {
    List<Medicamento> listarTodos();
    Medicamento obtenerPorId(Long id);
    Medicamento crear(Medicamento medicamento);
    Medicamento actualizar(Medicamento medicamento);
    void eliminar(Long id);
}