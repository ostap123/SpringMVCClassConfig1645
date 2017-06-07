package ua.com.owu.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String blogName;
    private String description;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "blog")
    private List<Post> posts = new ArrayList<Post>();



}
