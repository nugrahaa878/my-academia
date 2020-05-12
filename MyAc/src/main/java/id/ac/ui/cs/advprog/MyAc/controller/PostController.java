package id.ac.ui.cs.advprog.MyAc.controller;
import id.ac.ui.cs.advprog.MyAc.model.Post;
import id.ac.ui.cs.advprog.MyAc.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

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
    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
    public String getPostWithId(@PathVariable Long id,
                                Model model) {

        Optional<Post> optionalPost = postService.findById(id);

        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            model.addAttribute("post", post);
            return "/post";
        } else {
            return "/error";
        }
    }
//    @RequestMapping(value = "/editPost/{id}", method = RequestMethod.GET)
//    public String editPostWithId(@PathVariable Long id,
//                                 Model model) {
//        Optional<Post> optionalPost = postService.findById(id);
//
//        if (optionalPost.isPresent()) {
//            Post post = optionalPost.get();
//            model.addAttribute("post", post);
//            return "/newPostPage";
//        } else {
//            return "/error";
//        }
//    }
    @RequestMapping("/editPost/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("newPostPage");
        Optional<Post> post = postService.findById(id);
        mav.addObject("post", post);
        return mav;
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deletePostWithId(@PathVariable Long id) {

        Optional<Post> optionalPost = postService.findById(id);

            Post post = optionalPost.get();
                postService.delete(post);
                return "redirect:/forum";
    }
}

