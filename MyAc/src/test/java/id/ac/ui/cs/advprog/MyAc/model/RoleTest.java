package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  RoleTest {

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

    @Test
    public void testDefaultConstructor() {
        role = new Role();
        assertEquals(null, role.getName());
    }

    @Test
    public void testGetId() {
        Long id = this.role.getId();
        assertNull(id);
    }

    @Test
    public void testSetId() {
        long i = 100;
        Long id = i;
        this.role.setId(id);
        assertEquals(id, this.role.getId());
    }

    @Test
    public void testToString() {
        String hasil = this.role.toString();
        assertEquals("Role{" +
                "id=" + this.role.getId() +
                ", name='" + this.role.getName() + '\'' +
                '}', hasil);
    }
}
