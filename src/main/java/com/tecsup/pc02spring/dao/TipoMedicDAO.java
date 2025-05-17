package com.tecsup.pc02spring.dao;

import com.tecsup.pc02spring.model.TipoMedic;
import java.util.List;

public interface TipoMedicDAO {
    List<TipoMedic> findAll();
    TipoMedic findById(Long id);
    TipoMedic save(TipoMedic tipoMedic);
    void delete(Long id);
}