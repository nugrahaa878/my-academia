package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SemesterPlanTest {

    private SemesterPlan semesterPlan;

    @BeforeEach
    public void setUp() throws Exception {
        this.semesterPlan = new SemesterPlan(1L,2L, 3);
    }

    @Test
    public void testGetId() {
        assertEquals(1L, this.semesterPlan.getId());
    }

    @Test
    public void testGetIdLong() {
        assertEquals(2L, this.semesterPlan.getIdLong());
    }

    @Test
    public void testGetSemester() {
        assertEquals(3, this.semesterPlan.getSemester());
    }

}
