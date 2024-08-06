package com.example.cardviewrecyclerviewtutorial;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int cover;
    private String author;
    private String title;
    private String description;
    private Integer id;

    // Constructor
    public Book(int cover, String author, String title, String description) {
        this.cover = cover;
        this.author = author;
        this.title = title;
        this.description = description;
        this.id = id != null ? id : BookList.getSize();
    }

    // Getters and Setters
    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

