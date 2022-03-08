package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {

    private Less20 less20;

    @Before
    public void setUpTests() {
        less20 = new Less20();
    }

    @Test
    public void test_Less20() {
        // 1) num is 1 less than a multiple of 20 and return true.
        Assert.assertTrue(less20.isLessThanMultipleOf20(19));
        Assert.assertTrue(less20.isLessThanMultipleOf20(59));

        // 2) num is 2 less than a multiple of 20 and return true.
        Assert.assertTrue(less20.isLessThanMultipleOf20(38));
        Assert.assertTrue(less20.isLessThanMultipleOf20(78));

        // 3) num is 1  or 2 less than a multiple of 20 and return false.
        Assert.assertFalse(less20.isLessThanMultipleOf20(40));
        Assert.assertFalse(less20.isLessThanMultipleOf20(17));


    }
}
