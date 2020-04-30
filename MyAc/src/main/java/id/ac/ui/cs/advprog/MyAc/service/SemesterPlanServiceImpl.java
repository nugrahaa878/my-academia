package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.SemesterPlan;
import id.ac.ui.cs.advprog.MyAc.repository.SemesterPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemesterPlanServiceImpl implements SemesterPlanService {
    @Autowired
    private SemesterPlanRepository semesterPlanRepository;

    public List<SemesterPlan> findAll(){
        return semesterPlanRepository.findAll();
    }
    public Optional<SemesterPlan> findSemesterPlan(Long id){
        return semesterPlanRepository.findById(id);
    }
    public void erase(Long id){ //delete
        semesterPlanRepository.deleteById(id);
    }
    public SemesterPlan rewrite(SemesterPlan semesterPlan) { //update
        semesterPlanRepository.save(semesterPlan);
        return semesterPlan;
    }
    public SemesterPlan register(SemesterPlan semesterPlan) {//create
        semesterPlanRepository.save(semesterPlan);
        return semesterPlan;
    }
}
