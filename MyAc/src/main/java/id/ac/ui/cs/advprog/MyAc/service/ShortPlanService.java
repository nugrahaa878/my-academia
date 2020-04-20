package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.ComponentAbstract;
import java.util.List;

public interface ShortPlanService {
    void addComponent(String componentName, int percentage, int score);
    List<ComponentAbstract> getComponentList();
}
