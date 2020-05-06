package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoleTest {

    private Role role;

    @BeforeEach
    public void setUp() throws Exception {
        this.role = new Role("admin");
    }

    @Test
    public void testGetName() {
        assertEquals("admin", this.role.getName());
    }

    @Test
    public void testSetName() {
        this.role.setName("mahasiswa");
        assertEquals("mahasiswa", this.role.getName());
    }
}
