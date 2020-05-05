package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() throws Exception {
        this.user = new User("Ari", "Nugraha", "nugrahaa878@gmail.com", "admin123");
    }

    @Test
    public void testGetFirstName() {
        assertEquals("Ari", this.user.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Nugraha", this.user.getLastName());
    }

    @Test
    public void testGetEmail() {
        assertEquals("nugrahaa878@gmail.com", this.user.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("admin123", this.user.getPassword());
    }

    @Test
    public void testSetFirstName() {
        user.setFirstName("Angga");
        assertEquals("Angga", this.user.getFirstName());
    }

    @Test
    public void testSetLastName() {
        user.setLastName("Nugrahaa");
        assertEquals("Nugrahaa", this.user.getLastName());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("arinugraha@gmail.com");
        assertEquals("arinugraha@gmail.com", this.user.getEmail());
    }

    @Test
    public void testSetPassword() {
        this.user.setPassword("ari123456");
        assertEquals("ari123456", this.user.getPassword());
    }

}
