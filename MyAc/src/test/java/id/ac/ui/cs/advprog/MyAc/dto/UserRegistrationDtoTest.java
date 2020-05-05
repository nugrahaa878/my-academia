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
}
