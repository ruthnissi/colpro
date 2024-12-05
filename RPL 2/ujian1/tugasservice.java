package com.projectujian.service;

import com.projectujian.dao.TugasDAO;
import com.projectujian.model.TugasModel;

import java.util.List;

public class TugasService {

    private TugasDAO tugasDAO;

    public TugasService(TugasDAO tugasDAO) {
        this.tugasDAO = tugasDAO;
    }

    public List<TugasModel> getAllTugas() {
        return tugasDAO.getAllTugas();
    }

    public TugasModel getTugasById(int id) {
        return tugasDAO.getTugasById(id);
    }

    public void saveTugas(TugasModel tugas) {
        tugasDAO.saveTugas(tugas);
    }

    public void updateTugas(TugasModel tugas) {
        tugasDAO.updateTugas(tugas);
    }

    public void deleteTugas(int id) {
        tugasDAO.deleteTugas(id);
    }
}
