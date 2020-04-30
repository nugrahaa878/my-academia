package id.ac.ui.cs.advprog.MyAc.controller;


import id.ac.ui.cs.advprog.MyAc.model.Post;
import id.ac.ui.cs.advprog.MyAc.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
@Controller
@RequestMapping(path = "/forum")

public class ForumController {
    @Autowired
    private PostService postService;

    @RequestMapping("")
    public String viewForumPage(Model model) {
        List<Post> postList = postService.findAll();
        model.addAttribute("postList", postList);

        return "forumPage";
    }
}
