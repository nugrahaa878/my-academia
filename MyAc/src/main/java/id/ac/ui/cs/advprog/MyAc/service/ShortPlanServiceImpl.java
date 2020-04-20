package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.ComponentAbstract;
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
    public void addComponent(String componentName, int percentage, int score) {
        this.shortPlanRepository.addComponent(componentName, percentage, score);
    }

    @Override
    public List<ComponentAbstract> getComponentList() {
        return shortPlanRepository.getComponentList();
    }
}
