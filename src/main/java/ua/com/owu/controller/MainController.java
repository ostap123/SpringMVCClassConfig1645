package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.service.BlogService;

@Controller
public class MainController {
    @Autowired
    private BlogService blogService;

//    @RequestMapping(method = RequestMethod.GET, value = "/")
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("xxx", 1111);
        return "index";
    }
    @PostMapping("/saveBlog")
    public String saveBlog(@RequestParam String blogName,
                           @RequestParam String description){
        blogService.save(blogName, description);
        return "index";
    }

    @GetMapping("/blogsList")
    public String   blogsList(Model model){
        model.addAttribute("blogs", blogService.findAllBlogs());
        return "blogsListPage";
    }

}

