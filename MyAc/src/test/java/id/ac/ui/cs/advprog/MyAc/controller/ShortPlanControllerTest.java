package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.Component;
import id.ac.ui.cs.advprog.MyAc.repository.ShortPlanRepository;
import id.ac.ui.cs.advprog.MyAc.service.ShortPlanService;
import id.ac.ui.cs.advprog.MyAc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(controllers = ShortPlanController.class)
public class ShortPlanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ShortPlanRepository shortPlanRepository;

    @MockBean
    private ShortPlanService shortPlanService;

    @MockBean
    private UserService userService;

    private List<Component> generateComponent() {
        List<Component> componentList = new ArrayList<Component>();

        Component component = new Component();
        component.setComponentName("UAS");
        component.setPercentage(30);
        component.setScore(100);
        componentList.add(component);

        return componentList;
    }

    @WithMockUser(value = "spring")
    @Test
    public void testWhenComponentListURLIsAccessedItShouldContainCorrectDefaultComponentModel() throws Exception {
        List<Component> componentList = generateComponent();

        mockMvc.perform(get("/short-plan/"))
                .andExpect(status().isOk());
    }

//    @WithMockUser(value = "spring")
//    @Test
//    public void testWhenAddComponentURLIsAccessedItShouldCallShortPlanServiceAddComponent() throws Exception {
//        String componentName = "UAS";
//        int percentage = 30;
//        int score = 100;
//
//        mockMvc.perform(post("/short-plan/add")
//                .flashAttr("componentName", componentName)
//                .flashAttr("component", new Component())
//                .flashAttr("percentage", percentage)
//                .flashAttr("score", score))
//                .andExpect(handler().methodName("addComponent"));
//    }
}
