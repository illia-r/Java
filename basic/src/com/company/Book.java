package com.company;

public class Book {
    private String title;
    private int pages;

    public Book() {
        title = "unknown";
        pages = 1;
    }
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public Book(int pages, String title) {
        this.title = title;
        this.pages = pages;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pagess) {
        // this.page и pages - эквивалентны
        pages = pagess;
    }
}

