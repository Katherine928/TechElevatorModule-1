package com.techelevator;

public class NinjaApp {


    public static void main(String[] args) {


        String nameOfGame = "The great JG Ninja Game";


        String loweCaseEx =  nameOfGame.toLowerCase();
        String upperCaseEx = nameOfGame.toUpperCase();

        char c = nameOfGame.charAt(0);       // grabs the first letter of the string ==>
        System.out.println("First char is: " + c);
        char lastChar = nameOfGame.charAt(nameOfGame.length() - 1);   // grabbig the last char in the string

       boolean found = nameOfGame.contains("Ninja");

        if (nameOfGame.contains("JG")) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

        String newGame = nameOfGame.concat(" II ");  // same as " string 1 " + " another string"
        System.out.println(newGame);

        if (nameOfGame.endsWith("Game")) {
            System.out.println("Ends with Game");
        }
        else {
            System.out.println("Doesn't end with Game");
        }

        int indexOfGreat = nameOfGame.indexOf("great");   // starting index where char or phrase was found

        String partialString = nameOfGame.substring(10);
        System.out.println(partialString);


        String greatVar = nameOfGame.substring(4,9);  // watch this...
        System.out.println(greatVar);







        //Ninja is the datatype, matt is the variable of that Ninja type
        Ninja matt = new Ninja();
        matt.setColorOfNinja("Steel Blue");
        matt.setName("matt");
        matt.setNumberOfThrowingStars(6);


        //
        matt.sneakUpOnSomeone();
        matt.fight();


        Ninja dustin = new Ninja();
        dustin.setNumberOfThrowingStars(4);
        dustin.setName("Dustin The Invisible Ninja");

        dustin.fight();


    }


}
