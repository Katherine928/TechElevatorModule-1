package com.techelevator.bookstore;

public class ColoringBook extends Book{
    private String experienceLevel;

    public ColoringBook(String isBn, String title,String experienceLevel) {
        super(isBn, title);
        this.experienceLevel = experienceLevel;
    }


    public String getExperienceLevel() {
        return experienceLevel;
    }


    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
}
