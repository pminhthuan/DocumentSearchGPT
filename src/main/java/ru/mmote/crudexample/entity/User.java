package ru.mmote.crudexample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    // Mỗi người dùng có nhiều tương tác (interactions)
    @OneToMany(mappedBy = "user")
    private List<Interaction> interactions;

    // Mỗi người dùng có nhiều văn bản/tài liệu (documents)
    @OneToMany(mappedBy = "user")
    private List<Document> documents;

    public User() {
    }

    public User(Long id, String username, String password, List<Interaction> interactions, List<Document> documents) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.interactions = interactions;
        this.documents = documents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
