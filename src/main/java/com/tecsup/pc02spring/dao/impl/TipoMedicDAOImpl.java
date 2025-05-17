package com.tecsup.pc02spring.dao.impl;

import com.tecsup.pc02spring.dao.TipoMedicDAO;
import com.tecsup.pc02spring.model.TipoMedic;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class TipoMedicDAOImpl implements TipoMedicDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<TipoMedic> findAll() {
        return em.createQuery("FROM TipoMedic", TipoMedic.class).getResultList();
    }

    @Override
    public TipoMedic findById(Long id) {
        return em.find(TipoMedic.class, id);
    }

    @Override
    public TipoMedic save(TipoMedic tipoMedic) {
        if (tipoMedic.getCodTipoMed() == null) {
            em.persist(tipoMedic);
            return tipoMedic;
        } else {
            return em.merge(tipoMedic);
        }
    }

    @Override
    public void delete(Long id) {
        TipoMedic tipoMedic = findById(id);
        if (tipoMedic != null) {
            em.remove(tipoMedic);
        }
    }
}