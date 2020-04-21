package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.service.ForumServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(controllers = ForumController.class)
public class ForumControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ForumServiceImpl forumService;

    @Test
    public void whenForumUrlIsAccessedItShouldContainCorrectPostList() throws Exception {
        mockMvc.perform(get("/forum"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attributeExists("postList"))
                .andExpect(MockMvcResultMatchers.view().name("halamanUtamaForum"));
    }

    @Test
    public void whenAddUrlIsAccessedItShouldContainNewPost() throws Exception {
        mockMvc.perform(get("/forum/new"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attributeExists("post"))
                .andExpect(MockMvcResultMatchers.view().name("halamanPostBaru"));
    }

}
