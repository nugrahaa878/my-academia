package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = LongPlanController.class)
public class LongPlanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @WithMockUser(username = "spring")
    @Test
    public void whenLongPlanUrlAccessedShouldReturnLongPlanPage() throws Exception {
        mockMvc.perform(get("/longplan"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("longPlan"));
    }

    @WithMockUser(username = "spring")
    @Test
    public void whenLongPlanEditUrlAccessedShouldReturnLongPlanEditPage() throws Exception {
        mockMvc.perform(get("/longplan/edit"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("longPlanEdit"));
    }

    @WithMockUser(username = "spring")
    @Test
    public void whenLongPlanCreateUrlAccessedShouldReturnLongPlanCreatePage() throws Exception {
        mockMvc.perform(get("/longplan/create"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("longPlanCreate"));
    }

}
