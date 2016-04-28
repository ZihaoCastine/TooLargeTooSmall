package io.zihaocastine;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zihaocastine on 4/28/16.
 */
public class TooLargeTooSmallTest {
    @Test
    public void testGuessNum(){
        TooLargeTooSmall guessTest=new TooLargeTooSmall();
        boolean actualValue=guessTest.guess(2,2);
        boolean expectValue=true;
        Assert.assertEquals("Value should be true",  expectValue,actualValue);
    }
}
