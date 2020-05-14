package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import id.ac.ui.cs.advprog.MyAc.repository.MatkulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class MatkulServiceImpl implements MatkulService {

    private RestTemplate restTemplate = new RestTemplate();
    Matkul[] allMatkul = restTemplate.getForObject("http://matkulservice.herokuapp.com/matkul" , Matkul[].class);

    public Matkul[] findAll(){
        return allMatkul;
    }

    public List<Matkul> findMatkul(String matkul){
        List<Matkul> filteredMatkul = new ArrayList<>();
        for (Matkul matkulFind : allMatkul) {
            String namaMatkulLowerCase = matkulFind.getNama().toLowerCase();
            String namaMatkulDicariLowerCase = matkul.toLowerCase();
            if (namaMatkulLowerCase.contains(namaMatkulDicariLowerCase)) {
                filteredMatkul.add(matkulFind);
            }
        }
        return filteredMatkul;
    }
    public List<Matkul> findMatkulBySemester(String semester){
        List<Matkul> filteredMatkul = new ArrayList<>();
        for (Matkul matkulFind : allMatkul) {
            int semesterAll = matkulFind.getSemester();
            int semesterDicari = Integer.parseInt(semester);
            if (semesterAll == semesterDicari) {
                filteredMatkul.add(matkulFind);
            }
        }
        return filteredMatkul;

    }
    public List<Matkul> findMatkulWithSemester(String matkul, String semester){
        List<Matkul> filteredMatkul = new ArrayList<>();
        for (Matkul matkulFind : allMatkul) {
            String namaMatkulLowerCase = matkulFind.getNama().toLowerCase();
            String namaMatkulDicariLowerCase = matkul.toLowerCase();
            int semesterAll = matkulFind.getSemester();
            int semesterDicari = Integer.parseInt(semester);
            if (namaMatkulLowerCase.contains(namaMatkulDicariLowerCase) && semesterAll == semesterDicari) {
                filteredMatkul.add(matkulFind);
            }

        }
        return filteredMatkul;
    }
}

