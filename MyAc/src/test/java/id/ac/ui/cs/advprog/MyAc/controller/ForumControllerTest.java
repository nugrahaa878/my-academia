package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.service.ForumServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = ForumController.class)
public class ForumControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ForumServiceImpl forumService;

    @Test
    public void whenForumUrlIsAccessedItShouldContainCorrectPostList() throws Exception {
        mockMvc.perform(get("/forum"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("postList"))
                .andExpect(view().name("halamanUtamaForum"));
    }


}
