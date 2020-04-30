package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.LongPlan;

import java.util.List;
import java.util.Optional;

public interface LongPlanService {
    public List<LongPlan> findAll();
    public Optional<LongPlan> findLongPlan(Long id);
    public void erase(Long id); //delete
    public LongPlan rewrite(LongPlan longPlan); //update
    public LongPlan register(LongPlan longPlan); //create
}
