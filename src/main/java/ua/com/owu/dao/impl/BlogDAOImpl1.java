package ua.com.owu.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.BlogDAO;
import ua.com.owu.entity.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository("r1")
public class BlogDAOImpl1 implements BlogDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void save(Blog blog) {
        entityManager.persist(blog);
    }
}
