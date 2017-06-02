package ua.com.owu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by okten21 on 26.05.17.
 */
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String blogName;

    public Blog() {
    }

    public Blog(String blogName) {
        this.blogName = blogName;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blogName='" + blogName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }
}
