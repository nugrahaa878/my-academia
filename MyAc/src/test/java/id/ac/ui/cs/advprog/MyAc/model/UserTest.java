package id.ac.ui.cs.advprog.MyAc.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;
    private Role role;
    private Role role2;
    private ArrayList<Role> listRole;

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

    @Test
    public void testConstructorUser() {
        role = new Role("admin");
        listRole = new ArrayList<>();
        listRole.add(role);
        user = new User("Ari", "Nugraha", "nugrahaa878@gmail.com", "admin123", listRole);
        assertEquals("Ari", user.getFirstName());
    }

    @Test
    public void testDefaultConstructor() {
        user = new User();
        assertNull(user.getFirstName());
    }

    @Test
    public void testGetUserId() {
        Long id = this.user.getUser_id();
        assertNull(id);
    }

    @Test
    public void testSetUserId() {
        long i = 100;
        Long l = i;
        this.user.setUser_id(l);
        assertEquals(100, this.user.getUser_id());
    }

    @Test
    public void testGetRoles() {
        role = new Role("admin");
        role2 = new Role("user");
        listRole = new ArrayList<>();
        listRole.add(role);
        user = new User("Ari", "Nugraha", "nugrahaa878@gmail.com", "admin123", listRole);
        Collection<Role> listBaru = user.getRoles();
        assertEquals(listBaru, user.getRoles());
    }

    @Test
    public void testSetRoles() {
        role = new Role("admin");
        role2 = new Role("user");
        listRole = new ArrayList<>();
        listRole.add(role);
        user = new User("Ari", "Nugraha", "nugrahaa878@gmail.com", "admin123", listRole);
        Collection<Role> listBaru = user.getRoles();
        user.setRoles(listBaru);
        assertEquals(1, user.getRoles().size());
    }

    @Test
    public void testToString() {
        user = new User("Ari", "Nugraha", "nugrahaa878@gmail.com", "admin123", listRole);
        String hasil = user.toString();
        assertEquals("User{" +
                "id=" + user.getUser_id() +
                ", firstName='" + user.getFirstName() + '\'' +
                ", lastName='" + user.getLastName() + '\'' +
                ", email='" + user.getEmail() + '\'' +
                ", password='" + "*********" + '\'' +
                ", roles=" + user.getRoles() +
                '}', hasil);
    }
}
