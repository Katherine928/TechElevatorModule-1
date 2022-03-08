package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

    private DateFashion dateFashion;

    @Before
    public void setUpTests() {
        dateFashion = new DateFashion();
        Assert.assertNotNull(dateFashion);
    }

    @Test
    public void test_DataFashion() {
        // 1) Get a table and both are greater than and equal to 8.
        Assert.assertEquals(2,dateFashion.getATable(8,8));
        Assert.assertEquals(2,dateFashion.getATable(9,10));

        // 2) Get a table because one of person is greater than and equal to 8,
        //    and the other person is not less than and equal to 2.
        Assert.assertEquals(2,dateFashion.getATable(9,3));
        Assert.assertEquals(2,dateFashion.getATable(4,8));

        // 2) Didn't get a table because one of person is less and equal than 2.
        Assert.assertEquals(0,dateFashion.getATable(2,8));
        Assert.assertEquals(0,dateFashion.getATable(9,2));

        // 4) Didn't get a table because both are less than and equal to 2.
        Assert.assertEquals(0,dateFashion.getATable(2,1));
        Assert.assertEquals(0,dateFashion.getATable(0,0));

        // 5) Maybe get a table
        Assert.assertEquals(1,dateFashion.getATable(6,5));
        Assert.assertEquals(1,dateFashion.getATable(4,7));

    }
}
