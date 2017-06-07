package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.com.owu.entity.Blog;
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



    @GetMapping("/blogsList")
    public String   blogsList(Model model){
        model.addAttribute("blogs", blogService.findAllBlogs());
        return "blogsListPage";
    }

    @GetMapping("/blog-{xxx}")
    public String blogDetails(@PathVariable("xxx") int id, Model model){
        Blog oneById = blogService.findOneById(id);
        model.addAttribute("blog", oneById);

        return "blogDetailsPage";
    }

}

