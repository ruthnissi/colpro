package com.projectujian.dao;

import com.projectujian.model.TugasModel;

import java.util.List;

public interface TugasDAO {
    void saveTugas(TugasModel tugas);
    void updateTugas(TugasModel tugas);
    void deleteTugas(int id);
    TugasModel getTugasById(int id);
    List<TugasModel> getAllTugas();
}
