package com.tecsup.pc02spring.dao.impl;

import com.tecsup.pc02spring.dao.TipoMedicDAO;
import com.tecsup.pc02spring.model.TipoMedic;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class TipoMedicDAOImpl implements TipoMedicDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TipoMedic> listarTodos() {
        return entityManager.createQuery("FROM TipoMedic", TipoMedic.class).getResultList();
    }

    @Override
    public TipoMedic obtenerPorId(Long id) {
        return entityManager.find(TipoMedic.class, id);
    }

    @Override
    public void guardar(TipoMedic tipoMedic) {
        if (tipoMedic.getCodTipoMed() == null) {
            entityManager.persist(tipoMedic);
        } else {
            entityManager.merge(tipoMedic);
        }
    }

    @Override
    public void eliminar(Long id) {
        TipoMedic tipoMedic = entityManager.find(TipoMedic.class, id);
        if (tipoMedic != null) {
            entityManager.remove(tipoMedic);
        }
    }
}