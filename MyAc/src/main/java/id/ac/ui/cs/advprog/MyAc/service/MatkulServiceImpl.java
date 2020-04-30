package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import id.ac.ui.cs.advprog.MyAc.repository.MatkulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// TODO: Import service bean
@Service
public class MatkulServiceImpl implements MatkulService {
    // TODO: implementasi semua method di MatkulService.java. Coba lihat dokumentasi JpaRepository untuk mengimplementasikan Service

    @Autowired
    private MatkulRepository matkulRepository;

    public List<Matkul> findAll(){
        return matkulRepository.findAll();
    }
    public Optional<Matkul> findMatkul(String kode){
        return matkulRepository.findById(kode);
    }
    public void erase(String kode){ //delete
        matkulRepository.deleteById(kode);
    }
    public Matkul rewrite(Matkul matkul) { //update
        matkulRepository.save(matkul);
        return matkul;
    }
    public Matkul register(Matkul matkul) {//create
        matkulRepository.save(matkul);
        return matkul;
    }
}

