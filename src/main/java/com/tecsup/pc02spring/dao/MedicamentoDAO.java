package com.tecsup.pc02spring.dao;

import com.tecsup.pc02spring.model.Medicamento;
import java.util.List;

public interface MedicamentoDAO {
    List<Medicamento> listarTodos();
    Medicamento obtenerPorId(Long id);
    void guardar(Medicamento medicamento);
    void eliminar(Long id);
}