package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
    private SameFirstLast sameFirstLast;

    @Before
    public void setUpTests() {
        sameFirstLast = new SameFirstLast();
        Assert.assertNotNull(sameFirstLast);
    }

    @Test
    public void test_SameFirstLast() {
        // 1) Situations that return true.
        Assert.assertTrue(sameFirstLast.isItTheSame(new int[]{1,2,6,4,7,1}));
        Assert.assertTrue(sameFirstLast.isItTheSame(new int[]{5,6,2,8,3,5}));
        Assert.assertTrue(sameFirstLast.isItTheSame(new int[]{5}));

        // 2) Situations that return false.
        Assert.assertFalse(sameFirstLast.isItTheSame(new int[]{3,7,4,8,1}));
        Assert.assertFalse(sameFirstLast.isItTheSame(new int[]{9,4,5,7,6}));
        Assert.assertFalse(sameFirstLast.isItTheSame(new int[]{45,7,1,87,3}));


    }
}
