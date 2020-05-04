package id.ac.ui.cs.advprog.MyAc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return null;
    }

    @GetMapping("/login")
    public String login(Model model) {
        return null;
    }

    @GetMapping("/user")
    public String userIndex() {
        return "null";
    }
}
