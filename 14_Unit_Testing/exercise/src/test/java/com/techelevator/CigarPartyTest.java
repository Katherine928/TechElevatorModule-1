package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {


    private CigarParty cigarParty;

    @Before
    public void setUpTests() {
        cigarParty = new CigarParty();
        Assert.assertNotNull(cigarParty);
    }

    @Test
    public void test_CigarParty() {
        // 1) Not in the weekend and return true.
        Assert.assertTrue(cigarParty.haveParty(45,false));
        Assert.assertTrue(cigarParty.haveParty(60,false));

        // 2) Not in the weekend and return false
        Assert.assertFalse(cigarParty.haveParty(30,false));
        Assert.assertFalse(cigarParty.haveParty(65,false));

        // 3) In the weekend and return true
        Assert.assertTrue(cigarParty.haveParty(70,true));
        Assert.assertTrue(cigarParty.haveParty(40,true));

        // 4) In the weekend and return false
        Assert.assertFalse(cigarParty.haveParty(25,true));
        Assert.assertFalse(cigarParty.haveParty(0, true));
    }
}
