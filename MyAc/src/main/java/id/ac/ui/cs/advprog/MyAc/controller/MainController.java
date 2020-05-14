package id.ac.ui.cs.advprog.MyAc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import id.ac.ui.cs.advprog.MyAc.model.User;
import id.ac.ui.cs.advprog.MyAc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String root() {
        return "welcome";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    @GetMapping("/home")
    public String home(Principal principal, Model model) {
        User user = userRepository.findByEmail(principal.getName());
        model.addAttribute("nama", user.getFirstName());
        return "index";
    }

}
