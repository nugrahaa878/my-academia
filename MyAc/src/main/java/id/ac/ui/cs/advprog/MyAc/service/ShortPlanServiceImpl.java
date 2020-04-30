package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.Component;
import id.ac.ui.cs.advprog.MyAc.repository.ShortPlanRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShortPlanServiceImpl implements ShortPlanService {
    private final ShortPlanRepository shortPlanRepository;

    public ShortPlanServiceImpl(ShortPlanRepository shortPlanRepository) {
        this.shortPlanRepository = shortPlanRepository;
    }

    @Override
    public void addComponent(Component component) {
        this.shortPlanRepository.addComponent(component);
    }

    @Override
    public void addFinalScore(Component component) {
        this.shortPlanRepository.addFinalScore(component);
    }

    @Override
    public String getGrade() {
        return this.shortPlanRepository.getGrade();
    }

    @Override
    public double getFinalScore() {
        return this.shortPlanRepository.getFinalScore();
    }

    @Override
    public List<Component> getComponentList() {
        return shortPlanRepository.getComponentList();
    }
}
