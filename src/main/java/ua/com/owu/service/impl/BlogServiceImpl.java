package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.BlogDAO;
import ua.com.owu.entity.Blog;
import ua.com.owu.service.BlogService;

import java.util.List;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDAO blogDAO;

    public void save(String blogName, String description) {

        if (blogName != null && !blogName.isEmpty()) {
            Blog blog = Blog.builder().blogName(blogName).description(description).build();
            blogDAO.save(blog);
        }else {
            System.out.println("error!");
        }
    }

    public Blog findOneById(int id) {
        if(id >0)  return blogDAO.findOne(id); else return null;
    }

    public List<Blog> findAllBlogs() {
        return blogDAO.findAll();
    }
}
