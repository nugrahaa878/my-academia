package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.config.SecurityConfiguration;
import id.ac.ui.cs.advprog.MyAc.service.PostServiceImpl;
import id.ac.ui.cs.advprog.MyAc.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(controllers = PostController.class)
public class PostControllerTest extends WebSecurityConfigurerAdapter {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PostServiceImpl forumService;

    @MockBean
    private UserService userService;

    @WithMockUser(value = "spring")
    @Test
    public void whenAddUrlIsAccessedItShouldContainNewPost() throws Exception {
        mockMvc.perform(get("/forum/new"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attributeExists("post"))
                .andExpect(MockMvcResultMatchers.view().name("newPostPage"));
    }

}