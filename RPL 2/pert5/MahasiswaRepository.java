package com.mahasiswa.repository;

import com.mahasiswa.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author USER
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {
    
}
