package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComponentTest {
    Component component;

    @BeforeEach
    public void setUp() {
        component = new Component();

        this.component.setComponentName("UAS");
        this.component.setPercentage(30);
        this.component.setScore(100);
    }

    @Test
    public void testGetComponentName() {
        assertEquals("UAS", this.component.getComponentName());
    }

    @Test
    public void testGetPercentage() {
        assertEquals(30, this.component.getPercentage());
    }

    @Test
    public void testGetScore() {
        assertEquals(100, this.component.getScore());
    }
}
