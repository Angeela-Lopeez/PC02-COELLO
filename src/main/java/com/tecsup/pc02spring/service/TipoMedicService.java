package com.tecsup.pc02spring.service;

import com.tecsup.pc02spring.model.TipoMedic;
import java.util.List;

public interface TipoMedicService {
    List<TipoMedic> getAll();
    TipoMedic getById(Long id);
    TipoMedic save(TipoMedic tipoMedic);
    void delete(Long id);
}