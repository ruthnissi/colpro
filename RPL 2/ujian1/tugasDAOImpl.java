package com.projectujian.dao;

import com.projectujian.model.TugasModel;
import com.projectujian.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TugasDAOImpl implements TugasDAO {

    @Override
    public void saveTugas(TugasModel tugas) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(tugas);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void updateTugas(TugasModel tugas) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(tugas);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTugas(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            TugasModel tugas = session.get(TugasModel.class, id);
            if (tugas != null) {
                session.delete(tugas);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public TugasModel getTugasById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(TugasModel.class, id);
        }
    }

    @Override
    public List<TugasModel> getAllTugas() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Tugas", TugasModel.class).list();
        }
    }
}
