package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
    private StringBits stringBits;

    @Before
    public void setUpTests() {
        stringBits = new StringBits();
        Assert.assertNotNull(stringBits);
    }

    @Test
    public void test_StringBits() {
        // 1) Given String's length is less than and equal 1.
        Assert.assertEquals("H",stringBits.getBits("H"));
        Assert.assertEquals("a",stringBits.getBits("am"));

        // 2) Other situations.
        Assert.assertEquals("Blat",stringBits.getBits("Billant"));
        Assert.assertEquals("wieadna",stringBits.getBits("whitefardenia"));

    }
}
