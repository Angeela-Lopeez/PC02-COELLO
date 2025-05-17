package com.tecsup.pc02spring.dao;

import com.tecsup.pc02spring.model.Medicamento;
import java.util.List;

public interface MedicamentoDAO {
    List<Medicamento> findAll();
    Medicamento findById(Long id);
    Medicamento save(Medicamento medicamento);
    void delete(Long id);
}