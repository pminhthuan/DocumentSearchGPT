package ru.mmote.crudexample.entity;

import javax.persistence.*;

@Entity
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;
    private String answer;

    // Mỗi tương tác được thực hiện bởi một người dùng cụ thể
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Mỗi tương tác liên quan đến một tài liệu cụ thể
    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    public Interaction() {
    }

    public Interaction(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Interaction(Long id, String question, String answer, User user, Document document) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.user = user;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
