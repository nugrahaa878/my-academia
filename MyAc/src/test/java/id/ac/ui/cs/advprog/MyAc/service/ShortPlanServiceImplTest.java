package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.model.Component;
import id.ac.ui.cs.advprog.MyAc.repository.ShortPlanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShortPlanServiceImplTest {

    private ShortPlanRepository shortPlanRepository;
    private ShortPlanService shortPlanService;

    @BeforeEach
    public void setUp() {
        this.shortPlanRepository = new ShortPlanRepository();
        this.shortPlanService = new ShortPlanServiceImpl(this.shortPlanRepository);
    }

    @Test
    public void testAddComponents() {
        Component component = new Component();
        component.setComponentName("UAS");
        component.setPercentage(30);
        component.setScore(100);
        assertNotNull(this.shortPlanService.getComponentList());
    }

    @Test
    public void testGetComponents() {
        Component component = new Component();
        component.setComponentName("UAS");
        component.setPercentage(30);
        component.setScore(100);
        this.shortPlanService.addComponent(component);

        assertEquals("UAS", this.shortPlanService.getComponentList().get(0).getComponentName());
        assertEquals(30, this.shortPlanService.getComponentList().get(0).getPercentage());
        assertEquals(100, this.shortPlanService.getComponentList().get(0).getScore());
    }

    @Test
    public void testGetGrade() {
        Component component = new Component();
        component.setComponentName("UAS");
        component.setPercentage(30);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("E", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("UTS");
        component.setPercentage(20);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("D", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("Kuis");
        component.setPercentage(10);
        component.setScore(90);
        this.shortPlanService.addFinalScore(component);
        assertEquals("C", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("PR 1");
        component.setPercentage(5);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("C+", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("PR 2");
        component.setPercentage(5);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("B-", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("PR 3");
        component.setPercentage(5);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("B", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("PR 4");
        component.setPercentage(5);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("B+", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("PR 5");
        component.setPercentage(5);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("A-", this.shortPlanService.getGrade());

        component = new Component();
        component.setComponentName("PR 6");
        component.setPercentage(5);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);
        assertEquals("A", this.shortPlanService.getGrade());
    }

    @Test
    public void testGetFinalScore() {
        Component component = new Component();
        component.setComponentName("UAS");
        component.setPercentage(40);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);

        component = new Component();
        component.setComponentName("UTS");
        component.setPercentage(30);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);

        component = new Component();
        component.setComponentName("Kuis");
        component.setPercentage(30);
        component.setScore(100);
        this.shortPlanService.addFinalScore(component);

        assertEquals(100.0, this.shortPlanService.getFinalScore());
    }
}
