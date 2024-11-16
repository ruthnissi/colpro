package com.mahasiswa;

import com.mahasiswa.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author USER
 */
@SpringBootApplication
public class Pert5 implements CommandLineRunner {

    @Autowired
    private MahasiswaController mhsController;
    public static void main(String[] args) {
        SpringApplication.run(Pert5.class, args);
    }
    
    @Override
    public void run(String... args) {
        mhsController.tampilkanMenu();
    }
}
