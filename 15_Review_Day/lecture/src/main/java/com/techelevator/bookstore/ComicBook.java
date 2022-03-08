package com.techelevator.bookstore;

public class ComicBook extends Book{

    private int rating;
    public ComicBook(String isBn, String title,int rating) {
        super(isBn, title);
        this.rating = rating;
    }


    public int getRating() {
        return rating;
    }


    public void setRating(int rating) {
        this.rating = rating;
    }
}
