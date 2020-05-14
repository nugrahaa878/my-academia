package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.repository.LongPlanRepository;
import id.ac.ui.cs.advprog.MyAc.service.LongPlanService;
import id.ac.ui.cs.advprog.MyAc.service.LongPlanServiceImpl;
import id.ac.ui.cs.advprog.MyAc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = LongPlanAPIController.class)
public class LongPlanAPIControllerTest extends WebSecurityConfigurerAdapter{

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LongPlanRepository longPlanRepository;

    @MockBean
    private LongPlanService longPlanService;

    @MockBean
    private LongPlanServiceImpl longPlanServiceImpl;

    @MockBean
    private UserService userService;

//    @WithMockUser(value = "spring")
//    @Test
//    public void whenApiLongPlanUrlAccessedShouldOk() throws Exception {
//        mockMvc.perform(get("/api/longplan"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }

//    @WithMockUser(value = "spring")
//    @Test
//    public void whenApiSemesterPlanUrlAccessedShouldOk() throws Exception {
//        mockMvc.perform(get("/api/semesterplan"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//
//    @WithMockUser(value = "spring")
//    @Test
//    public void whenApiMatkulPlanUrlAccessedShouldOk() throws Exception {
//        mockMvc.perform(get("/api/matkulplan"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }

}
