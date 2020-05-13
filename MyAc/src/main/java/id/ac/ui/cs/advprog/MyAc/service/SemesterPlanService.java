package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.SemesterPlan;

import java.util.List;
import java.util.Optional;

public interface SemesterPlanService {
    public List<SemesterPlan> findAll();
    public Optional<SemesterPlan> findSemesterPlan(Long id);
    public void erase(Long id); //delete
    public SemesterPlan rewrite(SemesterPlan semesterPlan); //update
    public SemesterPlan register(SemesterPlan semesterPlan); //create
}
