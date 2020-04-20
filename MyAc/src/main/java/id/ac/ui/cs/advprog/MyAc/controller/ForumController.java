package id.ac.ui.cs.advprog.MyAc.controller;


import id.ac.ui.cs.advprog.MyAc.model.Post;
import id.ac.ui.cs.advprog.MyAc.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ForumController {
    @Autowired
    private ForumService forumService;

    @RequestMapping("/forum")
    public String viewHalamanForum(Model model) {
        List<Post> postList = forumService.findAll();
        model.addAttribute("postList", postList);

        return "halamanUtamaForum";
    }

    @RequestMapping("/new")
    public String showHalamanPostBaru(Model model) {
        Post post = new Post();
        model.addAttribute("post", post);

        return "halamanPostBaru";
    }

    @RequestMapping(value = "/simpan", method = RequestMethod.POST)
    public String simpanPost(@ModelAttribute("post") Post post) {
        forumService.save(post);

        return "redirect:/forum";
    }

}
