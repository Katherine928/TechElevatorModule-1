package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {
    private AnimalGroupName animalGroupName;

    @Before
    public void setUpTests() {
        animalGroupName = new AnimalGroupName();
        Assert.assertNotNull(animalGroupName);
    }

    @Test
    public void test_AnimalGroupName() {
        // 1) Animal not found or null.
        Assert.assertEquals("unknown",animalGroupName.getHerd(null));
        Assert.assertEquals("unknown",animalGroupName.getHerd("duck"));
        Assert.assertEquals("unknown",animalGroupName.getHerd(""));

        // 2) Case insensitive and accuracy Test
        Assert.assertEquals("Pride",animalGroupName.getHerd("lIoN"));
        Assert.assertEquals("Herd",animalGroupName.getHerd("deER"));
        Assert.assertEquals("Tower",animalGroupName.getHerd("GIRAFFE"));
        Assert.assertEquals("Murder",animalGroupName.getHerd("cRow"));

    }
}
