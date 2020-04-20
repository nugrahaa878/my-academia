package id.ac.ui.cs.advprog.MyAc.repository;

import id.ac.ui.cs.advprog.MyAc.model.Component;
import id.ac.ui.cs.advprog.MyAc.model.ComponentAbstract;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class ShortPlanRepository {
    private List<ComponentAbstract> componentList = new ArrayList<ComponentAbstract>();

    public List<ComponentAbstract> getComponentList() {return this.componentList;}

    public void addComponent(String componentName, int percentage, int score) {
        this.componentList.add(new Component(componentName, percentage, score));
    }
}
