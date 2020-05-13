package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.MatkulPlan;
import id.ac.ui.cs.advprog.MyAc.repository.MatkulPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatkulPlanServiceImpl implements MatkulPlanService{
    @Autowired
    private MatkulPlanRepository matkulPlanRepository;

    public List<MatkulPlan> findAll(){
        return matkulPlanRepository.findAll();
    }
    public Optional<MatkulPlan> findMatkulPlan(Long id){
        return matkulPlanRepository.findById(id);
    }
    public void erase(Long id){ //delete
        matkulPlanRepository.deleteById(id);
    }
    public MatkulPlan rewrite(MatkulPlan matkulPlan) { //update
        matkulPlanRepository.save(matkulPlan);
        return matkulPlan;
    }
    public MatkulPlan register(MatkulPlan matkulPlan) {//create
        matkulPlanRepository.save(matkulPlan);
        return matkulPlan;
    }
}
