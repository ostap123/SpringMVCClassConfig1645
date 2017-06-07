package ua.com.owu.service.editors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.owu.entity.Blog;
import ua.com.owu.service.BlogService;

import java.beans.PropertyEditorSupport;

@Component
public class BlogEditor extends PropertyEditorSupport {
    @Autowired
    private BlogService blogService;

    @Override
    public void setAsText(String id) throws IllegalArgumentException {

        int idBlog = Integer.parseInt(id);
        Blog blog = blogService.findOneById(idBlog);
        setValue(blog);
    }
}
