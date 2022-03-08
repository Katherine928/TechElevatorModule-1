package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Luck13Test {

    private Lucky13 lucky13;

    @Before
    public void setUpTests() {
        lucky13 = new Lucky13();
        Assert.assertNotNull(lucky13);
    }

    @Test
    public void test_Luck13() {
        // 1) String contains 1.
        Assert.assertFalse(lucky13.getLucky(new int[]{1,2,5}));
        Assert.assertFalse(lucky13.getLucky(new int[]{2,5,1,6,2,1}));

        // 2) String contains 3.
        Assert.assertFalse(lucky13.getLucky(new int[]{9,3,5,3,45}));
        Assert.assertFalse(lucky13.getLucky(new int[]{3,56,2,8,12}));

        // 3) String contains 1 and 3.
        Assert.assertFalse(lucky13.getLucky(new int[]{1,3,5}));
        Assert.assertFalse(lucky13.getLucky(new int[]{1,3,5,5,4,3,1}));

        // 4) String contains neither 1 nor 3.
        Assert.assertTrue(lucky13.getLucky(new int[]{5,7,4,9,76,45}));
        Assert.assertTrue(lucky13.getLucky(new int[]{8,5,6,4,9,54,6,8}));


    }
}
