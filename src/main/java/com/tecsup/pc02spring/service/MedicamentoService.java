package com.tecsup.pc02spring.service;

import com.tecsup.pc02spring.model.Medicamento;
import java.util.List;

public interface MedicamentoService {
    List<Medicamento> getAll();
    Medicamento getById(Long id);
    Medicamento save(Medicamento medicamento);
    void delete(Long id);
}