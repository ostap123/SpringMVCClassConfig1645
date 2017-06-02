package ua.com.owu.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.BlogDAO;
import ua.com.owu.entity.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository("r2")
public class BlogDAOImpl2 implements BlogDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void save(Blog blog) {
        if(blog != null){
            entityManager.persist(blog);
        }else{
            System.out.println("error");
        }
    }
}
