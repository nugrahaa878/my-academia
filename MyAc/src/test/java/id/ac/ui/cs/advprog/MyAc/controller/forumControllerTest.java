package id.ac.ui.cs.advprog.MyAc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ForumController.class)
public class forumControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ForumServiceImpl soulService;

    @Test
    public void whenSoulHomeURIIsAccessedItShouldHandledByFindAll() throws Exception {
        mockMvc.perform(get("/forum/")).andExpect(status().isOk()).andExpect(handler().methodName("findAll"));
    }
}
