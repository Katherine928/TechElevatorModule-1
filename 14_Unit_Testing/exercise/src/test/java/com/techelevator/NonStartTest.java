package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
    private NonStart nonStart;

    @Before
    public void setUpTests() {
        nonStart = new NonStart();
        Assert.assertNotNull(nonStart);
    }

    @Test
    public void test_NonStart() {
        // 1) The first string's length or last string's length is 1.
        Assert.assertEquals("ello",nonStart.getPartialString("H","Hello"));
        Assert.assertEquals("pple",nonStart.getPartialString("Apple","e"));

        // 2) Other situations.
        Assert.assertEquals("elloorld",nonStart.getPartialString("Hello","World"));
        Assert.assertEquals("oveou",nonStart.getPartialString("Love","You"));


    }
}
