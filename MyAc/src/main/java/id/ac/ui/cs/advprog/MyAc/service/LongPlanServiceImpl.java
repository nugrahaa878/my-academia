package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.LongPlan;
import id.ac.ui.cs.advprog.MyAc.repository.LongPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LongPlanServiceImpl implements LongPlanService {
    @Autowired
    private LongPlanRepository longPlanRepository;

    public List<LongPlan> findAll(){
        return longPlanRepository.findAll();
    }
    public Optional<LongPlan> findLongPlan(Long id){
        return longPlanRepository.findById(id);
    }
    public void erase(Long id){ //delete
        longPlanRepository.deleteById(id);
    }
    public LongPlan rewrite(LongPlan longPlan) { //update
        longPlanRepository.save(longPlan);
        return longPlan;
    }
    public LongPlan register(LongPlan longPlan) {//create
        longPlanRepository.save(longPlan);
        return longPlan;
    }
}
