package id.ac.ui.cs.advprog.MyAc.controller;

import id.ac.ui.cs.advprog.MyAc.model.Component;
import id.ac.ui.cs.advprog.MyAc.service.ShortPlanService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping(path = "/short-plan")
public class ShortPlanController {
    private final ShortPlanService shortPlanService;

    public ShortPlanController(ShortPlanService shortPlanService) {this.shortPlanService = shortPlanService;}

    @GetMapping(path = "/")
    public String shortPlan(Model model) {
        List<Component> componentList = shortPlanService.getComponentList();
        double finalScore = shortPlanService.getFinalScore();
        String grade = shortPlanService.getGrade();

        model.addAttribute("componentList", componentList);
        model.addAttribute("component", new Component());
        model.addAttribute("score", finalScore);
        model.addAttribute("grade", grade);
        return "short-plan";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addComponent(@ModelAttribute("component") Component component) {
        shortPlanService.addComponent(component);
        shortPlanService.addFinalScore(component);
        return "redirect:/short-plan/";
    }
}