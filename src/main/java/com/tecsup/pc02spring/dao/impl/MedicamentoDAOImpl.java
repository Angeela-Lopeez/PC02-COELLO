package com.tecsup.pc02spring.dao.impl;

import com.tecsup.pc02spring.dao.MedicamentoDAO;
import com.tecsup.pc02spring.model.Medicamento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class MedicamentoDAOImpl implements MedicamentoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Medicamento> listarTodos() {
        return entityManager.createQuery("FROM Medicamento", Medicamento.class).getResultList();
    }

    @Override
    public Medicamento obtenerPorId(Long id) {
        return entityManager.find(Medicamento.class, id);
    }

    @Override
    public void guardar(Medicamento medicamento) {
        if (medicamento.getCodMedicamento() == null) {
            entityManager.persist(medicamento); // INSERT
        } else {
            entityManager.merge(medicamento); // UPDATE
        }
    }

    @Override
    public void eliminar(Long id) {
        Medicamento medicamento = entityManager.find(Medicamento.class, id);
        if (medicamento != null) {
            entityManager.remove(medicamento);
        }
    }
}