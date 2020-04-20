package id.ac.ui.cs.advprog.MyAc.model;

public class Component extends ComponentAbstract {

    private String componentName;
    private int percentage;
    private int score;

    public Component(String componentName, int percentage, int score) {
        this.componentName = componentName;
        this.percentage = percentage;
        this.score = score;
    }

    @Override
    public String getComponentName() {
        return this.componentName;
    }

    @Override
    public int getPercentage() {
        return this.percentage;
    }

    @Override
    public int getScore() {
        return this.score;
    }
}
