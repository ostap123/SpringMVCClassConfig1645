package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.dao.BlogDAO;
import ua.com.owu.entity.Blog;

@Controller
public class MainController {
    @Qualifier("r1")
    @Autowired
    private BlogDAO blogDAO;

//    @RequestMapping(method = RequestMethod.GET, value = "/")
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("xxx", 1111);
        return "index";
    }
    @PostMapping("/saveBlog")
    public String saveBlog(@RequestParam("blogName") String xxx){
        System.out.println(xxx);
        Blog blog = new Blog(xxx);
        blogDAO.save(blog);
        return "index"; // springmvc1645
    }

}

