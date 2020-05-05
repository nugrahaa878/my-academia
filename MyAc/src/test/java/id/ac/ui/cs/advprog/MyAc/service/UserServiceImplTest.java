package id.ac.ui.cs.advprog.MyAc.service;

import id.ac.ui.cs.advprog.MyAc.dto.UserRegistrationDto;
import id.ac.ui.cs.advprog.MyAc.model.Role;
import id.ac.ui.cs.advprog.MyAc.model.User;
import id.ac.ui.cs.advprog.MyAc.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserServiceImpl userService;

    @MockBean
    private BCryptPasswordEncoder passwordEncoder;

    @Mock
    private UserRegistrationDto userRegistrationDto;

    private User user;

    @BeforeEach
    private void setUp() throws Exception {
        this.user = new User();
        this.user.setFirstName("Ari");
        this.user.setLastName("Nugraha");
        this.user.setEmail("nugrahaa878@gmail.com");
        this.user.setPassword("admin123");
    }

    @Test
    public void testWhenSaveCalledShouldSaveDto() {
        userService.save(this.userRegistrationDto);

        verify(userService, times(1)).save(this.userRegistrationDto);
    }

    @Test
    public void testWhenFindByEmailCalledShouldCallFindByEmail() {
        userService.findByEmail(this.user.getEmail());

        verify(userService, times(1)).findByEmail(this.user.getEmail());
    }

    @Test
    public void testWhenLoadByUserNameCalledShouldCallLoadByUsername() {
        userService.loadUserByUsername(this.user.getEmail());

        verify(userService, times(1)).loadUserByUsername(this.user.getEmail());
    }
}
