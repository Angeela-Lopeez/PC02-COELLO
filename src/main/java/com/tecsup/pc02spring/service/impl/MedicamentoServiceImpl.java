package com.tecsup.pc02spring.service.impl;

import com.tecsup.pc02spring.dao.MedicamentoDAO;
import com.tecsup.pc02spring.model.Medicamento;
import com.tecsup.pc02spring.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoDAO medicamentoDAO;

    @Override
    public List<Medicamento> listarTodos() {
        return medicamentoDAO.listarTodos();
    }

    @Override
    public Medicamento obtenerPorId(Long id) {
        return medicamentoDAO.obtenerPorId(id);
    }

    @Override
    public Medicamento crear(Medicamento medicamento) {
        medicamentoDAO.guardar(medicamento);
        return medicamento;
    }

    @Override
    public Medicamento actualizar(Medicamento medicamento) {
        medicamentoDAO.guardar(medicamento);
        return medicamento;
    }

    @Override
    public void eliminar(Long id) {
        medicamentoDAO.eliminar(id);
    }
}