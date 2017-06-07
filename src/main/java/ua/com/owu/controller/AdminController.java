package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.entity.Blog;
import ua.com.owu.entity.Post;
import ua.com.owu.service.BlogService;
import ua.com.owu.service.PostService;
import ua.com.owu.service.editors.BlogEditor;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private PostService postService;

    @GetMapping("/toAdminPage")
    public String toAdminPage(Model model) {
        model.addAttribute("blogs", blogService.findAllBlogs());
        return "adminPage";
    }

    @ModelAttribute("emptyPost")
    public Post emptyPost() {
        return new Post();
    }

    @PostMapping("/saveBlog")
    public String saveBlog(@RequestParam String blogName,
                           @RequestParam String description) {
        blogService.save(blogName, description);
        return "index";
    }

    @PostMapping("/savePost")
    public String savePost(@ModelAttribute("emptyPost") Post post) {
        postService.save(post);
        return "redirect:/admin/toAdminPage";

    }

    @Autowired
    private BlogEditor blogEditor;

    @InitBinder("emptyPost")
    public void binder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Blog.class,blogEditor);
    }


}
