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
    private UserServiceImpl userServiceImpl;

    @MockBean
    private BCryptPasswordEncoder passwordEncoder;

    private UserRegistrationDto userRegistrationDto;

    private User user;

//    @Test
//    public void testFindByEmail() {
//        user = new User();
//        user.setEmail("nugrahaa878@gmail.com");
//        user.setFirstName("Ari");
//        user.setLastName("Nugraha");
//        user.setPassword("admin123");
//        user.setRoles(null);
//
//        userRepository.save(user);
//
//        User cari = userServiceImpl.findByEmail("nugrahaa878@gmail.com");
//        assertEquals(user, cari);
//
//    }

    @Test
    public void testSave() {
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
        userRegistrationDto.setFirstName("Ari");
        userRegistrationDto.setLastName("Nugraha");
        userRegistrationDto.setPassword("admin123");
        userRegistrationDto.setConfirmPassword("admin123");
        userRegistrationDto.setEmail("nugrahaa878@gmail.com");
        userRegistrationDto.setConfirmEmail("nugrahaa878@gmail.com");
        userRegistrationDto.setTerms(true);

        User user = new User();
        user.setFirstName(userRegistrationDto.getFirstName());
        user.setLastName(userRegistrationDto.getLastName());
        user.setEmail(userRegistrationDto.getEmail());
        user.setPassword(userRegistrationDto.getPassword());
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));

        User user2 = this.userServiceImpl.save(userRegistrationDto);

        assertEquals(user2, userServiceImpl.save(userRegistrationDto));
    }

}
