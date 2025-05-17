package com.tecsup.pc02spring.service;

import com.tecsup.pc02spring.model.TipoMedic;
import java.util.List;

public interface TipoMedicService {
    List<TipoMedic> listarTodos();
    TipoMedic obtenerPorId(Long id);
    TipoMedic crear(TipoMedic tipoMedic);
    TipoMedic actualizar(TipoMedic tipoMedic);
    void eliminar(Long id);
}