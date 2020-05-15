package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.dto.UserRegistrationDto;
import id.ac.ui.cs.advprog.MyAc.model.User;
import id.ac.ui.cs.advprog.MyAc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.validation.BindingResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(controllers = UserRegistrationController.class)
public class UserRegistrationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @WithMockUser(username = "spring")
    @Test
    public void whenShowRegistrationFormCalledShouldReturnRegistrationFormPage() throws Exception {
        mockMvc.perform(get("/registration"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("registration"));
    }

//    @WithMockUser(username = "spring")
//    @Test
//    public void whenRegisterAccountCalledShouldRegisterUser() throws Exception {
//        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
//        userRegistrationDto.setTerms(true);
//        userRegistrationDto.setEmail("nugrahaa878@gmail.com");
//        userRegistrationDto.setConfirmEmail("nugrahaa878@gmail.com");
//        userRegistrationDto.setPassword("admin123");
//        userRegistrationDto.setConfirmPassword("admin123");
//        userRegistrationDto.setFirstName("Ari");
//        userRegistrationDto.setLastName("Nugraha");
//
//        User existing = userService.findByEmail(userRegistrationDto.getEmail());
//
//        mockMvc.perform(post("/registration").flashAttr("user", existing)
//        .flashAttr("halo",))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//
//    }

}
