package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.repository.UserRepository;
import id.ac.ui.cs.advprog.MyAc.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.ui.Model;

import java.security.Principal;
import static org.springframework.web.servlet.function.ServerResponse.status;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @MockBean
    private Principal principal;

    @MockBean
    private Model model;

    @WithMockUser(username = "spring")
    @Test
    public void whenLoginUrlAccessedShouldReturnLoginPage() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("login"));
    }

    @WithMockUser(username = "spring")
    @Test
    public void whenIndexUrlAccessedShouldReturnIndexPage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("welcome"));
    }

//    @WithMockUser(username = "spring")
//    @Test
//    public void whenHomeUrlAccessedShouldReturnHomePage() throws Exception {
//        Principal mockPrincipal = Mockito.mock(Principal.class);
//        mockMvc.perform(get("/home").principal(mockPrincipal))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(model().attributeExists("nama"))
//                .andExpect(view().name("index"));
//    }

}

