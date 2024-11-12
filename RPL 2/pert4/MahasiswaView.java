package mahasiswa.view;

import mahasiswa.model.ModelMahasiswa;
import mahasiswa.model.HibernateUtil;
import mahasiswa.model.ModelTabelMahasiswa;
import mahasiswa.controller.MahasiswaController;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author USER
 */
public class MahasiswaView extends javax.swing.JFrame {

    /**
     * Creates new form MahasiswaView
     */
    private MahasiswaController controller;
    public MahasiswaView() {
        initComponents();
        controller = new MahasiswaController();
        HibernateUtil.testConnection();
        loadMahasiswaTable();
    }
    public void loadMahasiswaTable() {
    
    List<ModelMahasiswa> listMahasiswa = controller.getAllMahasiswa();

    ModelTabelMahasiswa tableModel = new ModelTabelMahasiswa(listMahasiswa);

    dataTable.setModel(tableModel);
}

/**this is only bits of the code that we need to change, the rest of it is in the format of JPanelForm**/
