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
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Matkul matkul){
        matkulService.register(matkul);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{kode}")
    public ResponseEntity<Matkul> findById(@PathVariable String kode){
        Optional<Matkul> optionalMatkul = matkulService.findMatkul(kode);

        if(!optionalMatkul.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Matkul>(optionalMatkul.get(),HttpStatus.OK);
    }

    @GetMapping("/semester/{semester}")
    public ResponseEntity<List<Matkul>> findMatkulBySemester(@PathVariable int semester){
        List<Matkul> listMatkul = matkulService.findMatkulBySemester(semester);
        if(listMatkul.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
//        return new ResponseEntity<Matkul>(listMatkul,HttpStatus.OK);
        return new ResponseEntity(listMatkul, HttpStatus.OK);
//        return null;
    }



//    @PutMapping("/{kode}")
//    public ResponseEntity<Matkul> update(@PathVariable String kode, @RequestBody Matkul matkul){
//        Optional<Matkul> optionalMatkul = matkulService.findMatkul(kode);
//        if(optionalMatkul.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        matkul.setId(kode);
//        return new ResponseEntity<>(matkulService.rewrite(matkul),HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{kode}")
//    public ResponseEntity delete(@PathVariable String kode){
//        Optional<Matkul> optionalMatkul = matkulService.findMatkul(kode);
//        if(optionalMatkul.isEmpty()){
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
//        matkulService.erase(kode);
//        return new ResponseEntity(HttpStatus.OK);
//    }


}
