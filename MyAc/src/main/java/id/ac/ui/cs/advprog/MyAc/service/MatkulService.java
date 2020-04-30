package id.ac.ui.cs.advprog.MyAc.service;

// TODO: Import Matkul.java, Optional, dan List
import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import java.util.*;

public interface MatkulService {
    public List<Matkul> findAll();
    public Optional<Matkul> findMatkul(String kode);
    public void erase(String kode); //delete
    public Matkul rewrite(Matkul matkul); //update
    public Matkul register(Matkul matkul); //create
}

