package ua.com.owu.service;

import ua.com.owu.entity.Blog;

import java.util.List;

public interface BlogService {
    void save(String blogName, String description);

    Blog findOneById(int id);

    List<Blog> findAllBlogs();

}
