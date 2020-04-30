package id.ac.ui.cs.advprog.MyAc.model;

public class Component {

    private String componentName;
    private int percentage;
    private int score;

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public int getPercentage() {
        return this.percentage;
    }

    public int getScore() {
        return this.score;
    }
}
