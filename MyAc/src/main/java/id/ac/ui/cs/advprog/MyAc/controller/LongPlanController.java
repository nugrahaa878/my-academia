package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.LongPlan;
import id.ac.ui.cs.advprog.MyAc.model.MatkulPlan;
import id.ac.ui.cs.advprog.MyAc.model.SemesterPlan;
import id.ac.ui.cs.advprog.MyAc.service.LongPlanService;
import id.ac.ui.cs.advprog.MyAc.service.MatkulPlanService;
import id.ac.ui.cs.advprog.MyAc.service.SemesterPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/longplan")
public class LongPlanController {

    @Autowired
    private LongPlanService longPlanService;

    @Autowired
    private SemesterPlanService semesterPlanService;

    @Autowired
    private MatkulPlanService matkulPlanService;

    @GetMapping
    public ResponseEntity<List<LongPlan>> findAll(){
        return new ResponseEntity<>(longPlanService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/semesterplan")
    public ResponseEntity<List<SemesterPlan>> findAllSemester(){
        return new ResponseEntity<>(semesterPlanService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/semesterplan/matkulplan")
    public ResponseEntity<List<MatkulPlan>> findAllMatkul(){
        return new ResponseEntity<>(matkulPlanService.findAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody LongPlan longPlan){
        longPlanService.register(longPlan);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/semesterplan")
    public ResponseEntity create(@RequestBody SemesterPlan semesterPlan){
        semesterPlanService.register(semesterPlan);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/semesterplan/matkulplan")
    public ResponseEntity create(@RequestBody MatkulPlan matkulPlan){
        matkulPlanService.register(matkulPlan);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LongPlan> findById(@PathVariable Long id){
        Optional<LongPlan> optionalLongPlan = longPlanService.findLongPlan(id);
        if(!optionalLongPlan.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<LongPlan>(optionalLongPlan.get(),HttpStatus.OK);
    }

    @GetMapping("/semesterplan/{id}")
    public ResponseEntity<SemesterPlan> findByIdSemester(@PathVariable Long id){
        Optional<SemesterPlan> optionalSemesterPlan = semesterPlanService.findSemesterPlan(id);
        if(!optionalSemesterPlan.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<SemesterPlan>(optionalSemesterPlan.get(),HttpStatus.OK);
    }

    @GetMapping("/semesterplan/matkulplan/{id}")
    public ResponseEntity<MatkulPlan> findByIdMatkul(@PathVariable Long id){
        Optional<MatkulPlan> optionalMatkulPlan = matkulPlanService.findMatkulPlan(id);
        if(!optionalMatkulPlan.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<MatkulPlan>(optionalMatkulPlan.get(),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LongPlan> update(@PathVariable Long id, @RequestBody LongPlan longPlan){
        Optional<LongPlan> optionalLongPlan = longPlanService.findLongPlan(id);
        if(!optionalLongPlan.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        longPlan.setId(id);
        return new ResponseEntity<>(longPlanService.rewrite(longPlan),HttpStatus.OK);
    }

    @PutMapping("/semesterplan/{id}")
    public ResponseEntity<SemesterPlan> updateSemester(@PathVariable Long id, @RequestBody SemesterPlan semesterPlan){
        Optional<SemesterPlan> optionalSemesterPlan = semesterPlanService.findSemesterPlan(id);
        if(!optionalSemesterPlan.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        semesterPlan.setId(id);
        return new ResponseEntity<>(semesterPlanService.rewrite(semesterPlan),HttpStatus.OK);
    }

    @PutMapping("/semesterplan/matkulplan/{id}")
    public ResponseEntity<MatkulPlan> updateMatkul(@PathVariable Long id, @RequestBody MatkulPlan matkulPlan){
        Optional<MatkulPlan> optionalMatkulPlan = matkulPlanService.findMatkulPlan(id);
        if(!optionalMatkulPlan.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        matkulPlan.setId(id);
        return new ResponseEntity<>(matkulPlanService.rewrite(matkulPlan),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        Optional<LongPlan> optionalLongPlan = longPlanService.findLongPlan(id);
        if(!optionalLongPlan.isPresent()){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        longPlanService.erase(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/semesterplan/{id}")
    public ResponseEntity deleteSemester(@PathVariable Long id){
        Optional<SemesterPlan> optionalSemesterPlan = semesterPlanService.findSemesterPlan(id);
        if(!optionalSemesterPlan.isPresent()){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        semesterPlanService.erase(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/semesterplan/matkulplan/{id}")
    public ResponseEntity deleteMatkul(@PathVariable Long id){
        Optional<MatkulPlan> optionalMatkulPlan = matkulPlanService.findMatkulPlan(id);
        if(!optionalMatkulPlan.isPresent()){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        matkulPlanService.erase(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
