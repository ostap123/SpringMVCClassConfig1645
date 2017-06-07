package ua.com.owu.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String postTitle;
    private String postDescription;
    @ManyToOne(fetch = FetchType.LAZY)
    private Blog blog;

}
