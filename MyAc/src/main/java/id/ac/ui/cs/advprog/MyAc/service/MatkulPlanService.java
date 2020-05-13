package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.MatkulPlan;

import java.util.List;
import java.util.Optional;

public interface MatkulPlanService {
    public List<MatkulPlan> findAll();
    public Optional<MatkulPlan> findMatkulPlan(Long id);
    public void erase(Long id); //delete
    public MatkulPlan rewrite(MatkulPlan matkulPlan); //update
    public MatkulPlan register(MatkulPlan matkulPlan); //create
}
