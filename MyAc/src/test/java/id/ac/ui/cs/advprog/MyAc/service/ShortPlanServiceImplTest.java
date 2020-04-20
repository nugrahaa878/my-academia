package id.ac.ui.cs.advprog.MyAc.service;

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
        this.shortPlanService.addComponent("UAS", 30, 100);
        assertNotNull(this.shortPlanService.getComponentList());
    }

    @Test
    public void testGetComponents() {
        this.shortPlanService.addComponent("UAS", 30, 100);
        assertEquals("UAS", this.shortPlanService.getComponentList().get(0).getComponentName());
        assertEquals(30, this.shortPlanService.getComponentList().get(0).getPercentage());
        assertEquals(100, this.shortPlanService.getComponentList().get(0).getScore());
    }
}
