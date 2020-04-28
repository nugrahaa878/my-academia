package id.ac.ui.cs.advprog.MyAc.controller;
import id.ac.ui.cs.advprog.MyAc.model.Post;
import id.ac.ui.cs.advprog.MyAc.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/forum")

public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/new")
    public String viewNewPostPage(Model model) {
        Post post = new Post();
        model.addAttribute("post", post);

        return "newPostPage";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePost(@ModelAttribute("post") Post post) {
        postService.save(post);

        return "redirect:/forum";
    }
}

