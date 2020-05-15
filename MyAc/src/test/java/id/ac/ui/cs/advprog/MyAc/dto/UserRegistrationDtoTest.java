package id.ac.ui.cs.advprog.MyAc.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationDtoTest {

    UserRegistrationDto userRegistrationDto;

    @BeforeEach
    private void setUp() throws Exception {
        this.userRegistrationDto = new UserRegistrationDto();
    }

    @Test
    public void testSetFirstName() {
        this.userRegistrationDto.setFirstName("Ari");
        assertEquals("Ari", this.userRegistrationDto.getFirstName());
    }

    @Test
    public void testSetLastName() {
        this.userRegistrationDto.setLastName("Nugraha");
        assertEquals("Nugraha", this.userRegistrationDto.getLastName());
    }

    @Test
    public void testSetPassword() {
        this.userRegistrationDto.setPassword("admin123");
        assertEquals("admin123", this.userRegistrationDto.getPassword());
    }

    @Test
    public void testSetConfirmPassword() {
        this.userRegistrationDto.setConfirmPassword("admin1234");
        assertEquals("admin1234", this.userRegistrationDto.getConfirmPassword());
    }

    @Test
    public void testSetEmail() {
        this.userRegistrationDto.setEmail("ari.nugraha2318@gmail.com");
        assertEquals("ari.nugraha2318@gmail.com", this.userRegistrationDto.getEmail());
    }

    @Test
    public void testSetConfirmEmail() {
        this.userRegistrationDto.setConfirmEmail("ari.nugraha2318@gmail.com");
        assertEquals("ari.nugraha2318@gmail.com", this.userRegistrationDto.getConfirmEmail());
    }

    @Test
    public void testSetTerms() {
        this.userRegistrationDto.setTerms(false);
        assertEquals(false, this.userRegistrationDto.getTerms());
    }
}
