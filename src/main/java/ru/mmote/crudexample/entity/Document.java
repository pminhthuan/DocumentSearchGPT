package ru.mmote.crudexample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    // Mỗi tài liệu được tạo bởi một người dùng cụ thể
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Mỗi tài liệu có nhiều tương tác (interactions)
    @OneToMany(mappedBy = "document")
    private List<Interaction> interactions;

    public Document() {
    }

    public Document(Long id, String title, String content, User user, List<Interaction> interactions) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.interactions = interactions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }
}
