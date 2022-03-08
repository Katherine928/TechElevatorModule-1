package com.techelevator.bookstore;

public class Book {


    private String isBn;
    private String title;
    private double price;
    private int rating;
    private String experienceLevel;

    public Book(String isBn, String title) {
        this.isBn = isBn;
        this.title = title;
    }


    public String toString() {
        return this.isBn + ": " + this.title + " - " + "$" + this.price;
    }

    public String getIsBn() {
        return isBn;
    }

    public String getTitle() {
        return title;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
}
