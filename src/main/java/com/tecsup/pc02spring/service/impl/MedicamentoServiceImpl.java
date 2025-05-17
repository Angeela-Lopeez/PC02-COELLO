package com.tecsup.pc02spring.service.impl;

import com.tecsup.pc02spring.dao.MedicamentoDAO;
import com.tecsup.pc02spring.model.Medicamento;
import com.tecsup.pc02spring.service.MedicamentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    private final MedicamentoDAO medicamentoDAO;

    public MedicamentoServiceImpl(MedicamentoDAO medicamentoDAO) {
        this.medicamentoDAO = medicamentoDAO;
    }

    @Override
    public List<Medicamento> getAll() {
        return medicamentoDAO.findAll();
    }

    @Override
    public Medicamento getById(Long id) {
        return medicamentoDAO.findById(id);
    }

    @Override
    public Medicamento save(Medicamento medicamento) {
        return medicamentoDAO.save(medicamento);
    }

    @Override
    public void delete(Long id) {
        medicamentoDAO.delete(id);
    }
}