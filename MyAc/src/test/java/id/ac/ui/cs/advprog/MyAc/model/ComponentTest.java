package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComponentTest {
    ComponentAbstract component;

    @BeforeEach
    public void setUp() {
        this.component = new Component("UAS", 30, 100);
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
