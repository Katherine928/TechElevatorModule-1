package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {
    private MaxEnd3 maxEnd3;

    @Before
    public void setUpTests() {
        maxEnd3 = new MaxEnd3();
        Assert.assertNotNull(maxEnd3);
    }

    @Test
    public void test_MaxEnd3() {
        // 1) First num is larger.
        Assert.assertArrayEquals(new int[]{5,5,5},maxEnd3.makeArray(new int[]{5,8,2}));
        Assert.assertArrayEquals(new int[]{8,8,8},maxEnd3.makeArray(new int[]{8,8,2}));

        // 2) Last num is larger.
        Assert.assertArrayEquals(new int[]{7,7,7},maxEnd3.makeArray(new int[]{5,8,7}));
        Assert.assertArrayEquals(new int[]{5,5,5},maxEnd3.makeArray(new int[]{4,8,5}));

    }
}
