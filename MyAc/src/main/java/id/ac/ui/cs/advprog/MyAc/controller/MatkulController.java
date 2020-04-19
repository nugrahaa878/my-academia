package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.Matkul;
import id.ac.ui.cs.advprog.MyAc.service.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/matkul")
public class MatkulController {

    @Autowired
    private MatkulService matkulService;
    

    @GetMapping
    public ResponseEntity<List<Matkul>> findAll(){
        return new ResponseEntity<>(matkulService.findAll(),HttpStatus.OK);
//        return null;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Matkul matkul){
        matkulService.register(matkul);
        return new ResponseEntity(HttpStatus.OK);
//        return null;
    }

    @GetMapping("/{kode}")
    public ResponseEntity<Matkul> findById(@PathVariable String kode){
        Optional<Matkul> optionalMatkul = matkulService.findMatkul(kode);
//        if(optionalMatku){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
        return new ResponseEntity<Matkul>(optionalMatkul.get(),HttpStatus.OK);
//        return null;
    }

}
