package id.ac.ui.cs.advprog.MyAc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// TODO: Import Matkul.java
import id.ac.ui.cs.advprog.MyAc.model.Matkul;

public interface MatkulRepository extends JpaRepository<Matkul, String> {
}

