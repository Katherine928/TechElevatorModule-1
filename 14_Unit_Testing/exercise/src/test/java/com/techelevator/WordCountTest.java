package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    private WordCount wordCount;

    @Before
    public void setUpTests() {
        wordCount = new WordCount();
        Assert.assertNotNull(wordCount);
    }

    @Test
    public void test_WordCount() {
        // 1) Given String is empty.
        Map<String,Integer>output1 = new HashMap<>();
        Assert.assertEquals(output1,wordCount.getCount(new String[]{}));

        // 2) Other situations.
        Map<String,Integer>output2 = new HashMap<>();
        output2.put("winter",2);
        output2.put("summer",1);
        output2.put("spring",1);
        Assert.assertEquals(output2,wordCount.getCount(new String[]{"winter","summer","winter","spring"}));

        Map<String,Integer>output3 = new HashMap<>();
        output3.put("one",1);
        output3.put("two",2);
        output3.put("three",3);
        output3.put("four",4);
        Assert.assertEquals(output3,wordCount.getCount(new String[]{"one","two","three","four","two","three","four","three","four","four"}));

    }
}
