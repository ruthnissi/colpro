package com.projectujian.service;

import com.projectujian.dao.TugasDAO;
import com.projectujian.model.TugasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TugasServiceImpl extends TugasService {

    @Autowired
    private TugasDAO tugasDAO;

    public TugasServiceImpl(TugasDAO tugasDAO) {
        super(tugasDAO);
    }

    @Override
    public void saveTugas(TugasModel tugas) {
        tugasDAO.saveTugas(tugas);
    }

    @Override
    public void updateTugas(TugasModel tugas) {
        tugasDAO.updateTugas(tugas);
    }

    @Override
    public void deleteTugas(int id) {
        tugasDAO.deleteTugas(id);
    }

    @Override
    public TugasModel getTugasById(int id) {
        return tugasDAO.getTugasById(id);
    }

    @Override
    public List<TugasModel> getAllTugas() {
        return tugasDAO.getAllTugas();
    }
}
