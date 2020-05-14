package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongPlanTest {

    private LongPlan longPlan;

    @BeforeEach
    public void setUp() throws Exception {
        this.longPlan = new LongPlan(1L,2L, "To be Great Spring Developer");
    }

    @Test
    public void testGetId() {
        assertEquals(1L, this.longPlan.getId());
    }

    @Test
    public void testGetKodeUser() {
        assertEquals(2L, this.longPlan.getKodeUser());
    }

    @Test
    public void testGetNamaLongPlan() {
        assertEquals("To be Great Spring Developer", this.longPlan.getNamaLongPlan());
    }
}
