package com.tecsup.pc02spring.service.impl;

import com.tecsup.pc02spring.dao.TipoMedicDAO;
import com.tecsup.pc02spring.model.TipoMedic;
import com.tecsup.pc02spring.service.TipoMedicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoMedicServiceImpl implements TipoMedicService {

    private final TipoMedicDAO tipoMedicDAO;

    public TipoMedicServiceImpl(TipoMedicDAO tipoMedicDAO) {
        this.tipoMedicDAO = tipoMedicDAO;
    }

    @Override
    public List<TipoMedic> getAll() {
        return tipoMedicDAO.findAll();
    }

    @Override
    public TipoMedic getById(Long id) {
        return tipoMedicDAO.findById(id);
    }

    @Override
    public TipoMedic save(TipoMedic tipoMedic) {
        return tipoMedicDAO.save(tipoMedic);
    }

    @Override
    public void delete(Long id) {
        tipoMedicDAO.delete(id);
    }
}