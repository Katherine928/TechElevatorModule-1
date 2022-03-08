package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieRentalTest {

    @Test
    public void retalPriceTest() {
        MovieRental testCase1 = new MovieRental("movieName1","DVD",false);
        MovieRental testCase2 = new MovieRental("movieName2","DVD",true);
        MovieRental testCase3 = new MovieRental("movieName3","Blu-ray",false);
        MovieRental testCase4 = new MovieRental("movieName4","Blu-ray",true);
        MovieRental testCase5 = new MovieRental("movieName5","VHS",false);
        MovieRental testCase6 = new MovieRental("movieName6","VHS",true);

        Assert.assertEquals(1.99,testCase1.getPrice(),1);
        Assert.assertEquals(2.99,testCase2.getPrice(),1);
        Assert.assertEquals(2.99,testCase3.getPrice(),1);
        Assert.assertEquals(3.99,testCase4.getPrice(),1);
        Assert.assertEquals(0.99,testCase5.getPrice(),1);
        Assert.assertEquals(1.99,testCase6.getPrice(),1);

    }

    @Test
    public void lateFee() {
        MovieRental testCase = new MovieRental("movieName","DVD",false);
        Assert.assertEquals(0.00,testCase.lateFee(0),1);
        Assert.assertEquals(1.99,testCase.lateFee(1),1);
        Assert.assertEquals(3.99,testCase.lateFee(2),1);
        Assert.assertEquals(19.99,testCase.lateFee(3),1);
        Assert.assertEquals(19.99,testCase.lateFee(5),1);


    }
}
