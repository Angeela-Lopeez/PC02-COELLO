package com.tecsup.pc02spring.dao;

import com.tecsup.pc02spring.model.TipoMedic;
import java.util.List;

public interface TipoMedicDAO {
    List<TipoMedic> listarTodos();
    TipoMedic obtenerPorId(Long id);
    void guardar(TipoMedic tipoMedic);
    void eliminar(Long id);
}