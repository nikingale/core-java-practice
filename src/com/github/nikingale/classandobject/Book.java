package com.github.nikingale.classandobject;
public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private float price;

    public Book(String title, String author, String genre, int pages, float price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void displayBook() {
        System.out.println("Book Title - " + this.title + "\nBook Author - " + this.author + "\nBook Genre - " + this.genre + "\nBook Pages - " + this.pages + "\nBook Price - " + this.price);
    }

}