package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.Component;
import id.ac.ui.cs.advprog.MyAc.model.ComponentAbstract;
import id.ac.ui.cs.advprog.MyAc.repository.ShortPlanRepository;
import id.ac.ui.cs.advprog.MyAc.service.ShortPlanService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

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

    private List<ComponentAbstract> generateComponent() {
        List<ComponentAbstract> componentList = new ArrayList<ComponentAbstract>();
        componentList.add(new Component("UAS", 30, 100));

        return componentList;
    }

    @Test
    public void testWhenComponentListURLIsAccessedItShouldContainCorrectDefaultComponentModel() throws Exception {
        List<ComponentAbstract> componentList = generateComponent();

        mockMvc.perform(get("/short-plan/"))
                .andExpect(status().isOk());
    }

    @Test
    public void testWhenAddComponentURLIsAccessedItShouldCallShortPlanServiceAddComponent() throws Exception {
        String componentName = "UAS";
        int percentage = 30;
        int score = 100;

        mockMvc.perform(post("/short-plan/add")
            .flashAttr("componentName", componentName)
            .flashAttr("percentage", percentage)
            .flashAttr("score", score))
                .andExpect(handler().methodName("addComponent"));
    }
}
