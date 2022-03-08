package com.techelevator;

public class Ninja {

    private String colorOfNinja;
    private String name;
    private boolean isVisible = true;
    private int numberOfThrowingStars;



    public void sneakUpOnSomeone() {


        System.out.println("Gotcha!");

    }

    public void fight() {

        if(true) {
            System.out.println("1");
        }




        System.out.println("You dead!");
    }


    public String getColorOfNinja() {
        return colorOfNinja;
    }

    public void setColorOfNinja(String colorOfNinja) {
        this.colorOfNinja = colorOfNinja;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public int getNumberOfThrowingStars() {
        return numberOfThrowingStars;
    }

    public void setNumberOfThrowingStars(int numberOfThrowingStars) {
        this.numberOfThrowingStars = numberOfThrowingStars;
    }
}
