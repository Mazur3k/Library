package com.hibernate.demo.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<Author> authors;

    private String title;
    private int size;

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setAuthor(List<Author> authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Category getCategory() {
        return category;
    }

    public List<Author> getAuthor() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public Book(Category category, List<Author> authors, String title, int size) {

        this.category = category;
        this.authors = authors;
        this.title = title;
        this.size = size;
    }
}
