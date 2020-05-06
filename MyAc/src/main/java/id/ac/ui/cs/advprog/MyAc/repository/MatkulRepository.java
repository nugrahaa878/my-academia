package id.ac.ui.cs.advprog.MyAc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// TODO: Import Matkul.java
import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatkulRepository extends JpaRepository<Matkul, String> {

    @Query("SELECT t FROM Matkul t where t.semester = :semester")
    List<Matkul> findMatkulBySemester(@Param("semester") int semester);
}

