package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.service.PostServiceImpl;
import id.ac.ui.cs.advprog.MyAc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(controllers = ForumController.class)
public class ForumControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PostServiceImpl forumService;

    @MockBean
    private UserService userService;

    @WithMockUser(value = "spring")
    @Test
    public void whenForumUrlIsAccessedItShouldContainCorrectPostList() throws Exception {
        mockMvc.perform(get("/forum"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attributeExists("postList"))
                .andExpect(MockMvcResultMatchers.view().name("forumPage"));
    }
}
