package ru.mirea.dz2;

public class Book {
    private String author;
    private int numPage;

    public Book(String author, int numPage) {
        this.author = author;
        this.numPage = numPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
}
