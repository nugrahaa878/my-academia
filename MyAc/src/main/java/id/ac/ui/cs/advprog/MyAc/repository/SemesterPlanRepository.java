package id.ac.ui.cs.advprog.MyAc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import id.ac.ui.cs.advprog.MyAc.model.SemesterPlan;

public interface SemesterPlanRepository extends JpaRepository<SemesterPlan, Long> {
}
