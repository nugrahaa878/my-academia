package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.ComponentAbstract;
import id.ac.ui.cs.advprog.MyAc.service.ShortPlanService;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;

@RestController
@RequestMapping(path = "/short-plan")
public class ShortPlanController {
    private final ShortPlanService shortPlanService;

    public ShortPlanController(ShortPlanService shortPlanService) {this.shortPlanService = shortPlanService;}

    @GetMapping(path = "/")
    public String shortPlan(Model model) {
        List<ComponentAbstract> componentList = shortPlanService.getComponentList();
        model.addAttribute("componentList", componentList);
        return"ShortPlan/short-plan";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addComponent(@ModelAttribute("componentName") String componentName,
                               @ModelAttribute("percentage") int percentage,
                               @ModelAttribute("score") int score) {

        shortPlanService.addComponent(componentName, percentage, score);
        return "redirect:/short-plan/";
    }
}