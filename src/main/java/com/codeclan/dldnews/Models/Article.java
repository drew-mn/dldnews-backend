package com.codeclan.dldnews.Models;

import java.util.Date;

public class Article {

    private Long id;
    private Author author;
    private String title;
    private Date date;
    private Category category;
    private String summary;
    private String fullText;
    private String media;
    private int readCounter;
    private boolean bookmarked;

    public Article(Author author, String title, Date date, Category category, String summary, String fullText, String media) {
        this.author = author;
        this.title = title;
        this.date = date;
        this.category = category;
        this.summary = summary;
        this.fullText = fullText;
        this.media = media;
        this.readCounter = 0;
        this.bookmarked = false;
    }
}
