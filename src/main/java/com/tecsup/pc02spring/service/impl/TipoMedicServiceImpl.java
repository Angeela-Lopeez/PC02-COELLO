package com.tecsup.pc02spring.service.impl;

import com.tecsup.pc02spring.dao.TipoMedicDAO;
import com.tecsup.pc02spring.model.TipoMedic;
import com.tecsup.pc02spring.service.TipoMedicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoMedicServiceImpl implements TipoMedicService {

    @Autowired
    private TipoMedicDAO tipoMedicDAO;

    @Override
    public List<TipoMedic> listarTodos() {
        return tipoMedicDAO.listarTodos();
    }

    @Override
    public TipoMedic obtenerPorId(Long id) {
        return tipoMedicDAO.obtenerPorId(id);
    }

    @Override
    public TipoMedic crear(TipoMedic tipoMedic) {
        tipoMedicDAO.guardar(tipoMedic);
        return tipoMedic;
    }

    @Override
    public TipoMedic actualizar(TipoMedic tipoMedic) {
        tipoMedicDAO.guardar(tipoMedic);
        return tipoMedic;
    }

    @Override
    public void eliminar(Long id) {
        tipoMedicDAO.eliminar(id);
    }
}