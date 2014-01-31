package com.udaykant;

import org.junit.Test;
import junit.framework.Assert;

public class ProbabilityTest {
    @Test
    public void testGetValue() throws Exception {
        Probability probability = new Probability(0.5d);
        Assert.assertEquals(0.5d, probability.getValue(), 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testForException() {
        double expected = 0;
        Probability probability = new Probability(1d, 0d);
        Assert.assertEquals(expected, probability.getValue(), 1);
    }

    @Test
    public void testProbabilityDoubleCoinForAnd() throws Exception {
        Probability p1 = new Probability(1d, 6d);
        Probability p2 = new Probability(1d, 6d);
        Assert.assertEquals(1d / 36d, p1.and(p2).getValue());
    }
    @Test
    public void testProbabilityDoubleCoinForOr() throws Exception {
        Probability p1 = new Probability(1d, 6d);
        Probability p2 = new Probability(1d, 6d);
        Assert.assertEquals(11d / 36d, p1.or(p2).getValue(), 1);
    }
    @Test
    public void testProbabilityDoubleCoinForXor() throws Exception {
        Probability p1 = new Probability(1d, 6d);
        Probability p2 = new Probability(1d, 6d);
        Assert.assertEquals(11d / 36d, p1.or(p2).getValue(),1);
    }
}
