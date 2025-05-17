package com.tecsup.pc02spring.dao.impl;

import com.tecsup.pc02spring.dao.MedicamentoDAO;
import com.tecsup.pc02spring.model.Medicamento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class MedicamentoDAOImpl implements MedicamentoDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Medicamento> findAll() {
        return em.createQuery("FROM Medicamento", Medicamento.class).getResultList();
    }

    @Override
    public Medicamento findById(Long id) {
        return em.find(Medicamento.class, id);
    }

    @Override
    public Medicamento save(Medicamento medicamento) {
        if (medicamento.getCodMedicamento() == null) {
            em.persist(medicamento);
            return medicamento;
        } else {
            return em.merge(medicamento);
        }
    }

    @Override
    public void delete(Long id) {
        Medicamento medicamento = findById(id);
        if (medicamento != null) {
            em.remove(medicamento);
        }
    }
}