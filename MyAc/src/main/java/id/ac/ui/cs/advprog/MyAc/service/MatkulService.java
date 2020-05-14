package id.ac.ui.cs.advprog.MyAc.service;

// TODO: Import Matkul.java, Optional, dan List
import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import java.util.*;

public interface MatkulService {

    Matkul[] findAll();
    List<Matkul> findMatkul(String matkul);
    List<Matkul> findMatkulBySemester(String semester);
    List<Matkul> findMatkulWithSemester(String matkul, String semester);

}