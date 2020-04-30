package id.ac.ui.cs.advprog.MyAc.repository;

import id.ac.ui.cs.advprog.MyAc.model.Component;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class ShortPlanRepository {
    private List<Component> componentList = new ArrayList<Component>();
    private double finalScore;

    public List<Component> getComponentList() {
        return this.componentList;
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    public void addFinalScore(Component component) {
        this.finalScore = this.finalScore + (component.getPercentage() * component.getScore())/100.0;
    }

    public double getFinalScore() {
        return this.finalScore;
    }

    public String getGrade() {
        if (this.finalScore >= 85) return "A";
        if (this.finalScore >= 80) return "A-";
        if (this.finalScore >= 75) return "B+";
        if (this.finalScore >= 70) return "B";
        if (this.finalScore >= 65) return "B-";
        if (this.finalScore >= 60) return "C+";
        if (this.finalScore >= 55) return "C";
        if (this.finalScore >= 40) return "D";
        return "E";
    }
}