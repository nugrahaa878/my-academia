package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.Component;

import java.util.List;

public interface ShortPlanService {
    void addComponent(Component component);

    void addFinalScore(Component component);

    String getGrade();

    double getFinalScore();

    List<Component> getComponentList();
}
