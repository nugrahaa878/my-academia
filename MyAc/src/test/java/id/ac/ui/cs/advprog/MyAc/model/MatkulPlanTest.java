package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatkulPlanTest {

    private MatkulPlan matkulPlan;

    @BeforeEach
    public void setUp() throws Exception {
        this.matkulPlan = new MatkulPlan(1L,2L, "CS1234");
    }

    @Test
    public void testGetId() {
        assertEquals(1L, this.matkulPlan.getId());
    }

    @Test
    public void testGetIdSemester() {
        assertEquals(2L, this.matkulPlan.getIdSemester());
    }

    @Test
    public void testGetKodeMatkul() {
        assertEquals("CS1234", this.matkulPlan.getKodeMatkul());
    }
}
