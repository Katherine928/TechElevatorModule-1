package com.techelevator;

public class MovieRental {

    private String title;
    private String format;
    private boolean isPremiumMovies;
    private double price;

    public MovieRental(String title, String format, boolean isPremiumMovies) {
        this.title = title;
        this.format = format;
        this.isPremiumMovies = isPremiumMovies;
    }


    public String toString() {
        return this.title + " - " + this.format + " " + this.getPrice();
    }

    public double lateFee(int daysLate) {
        if(daysLate == 0) {
            return 0.0;
        } else if (daysLate == 1) {
            return 1.99;
        } else if (daysLate == 2) {
            return 3.99;
        } else {
            return 19.99;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isPremiumMovies() {
        return isPremiumMovies;
    }

    public void setPremiumMovies(boolean premiumMovies) {
        isPremiumMovies = premiumMovies;
    }

    public double getPrice() {
        switch (this.format) {
            case "VHS":
                this.price = 0.99;
                break;
            case "DVD":
                this.price = 1.99;
                break;
            case "Blu-ray":
                this.price = 2.99;
                break;
        }
        if(this.isPremiumMovies) {
            this.price += 1.00;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
