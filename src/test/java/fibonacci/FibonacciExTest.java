package fibonacci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciExTest {

    @Test
    public void fibonacciTestFirstCorrect() {
        FibonacciEx fibo = new FibonacciEx();
        int expectedResult = 0;
        int actualResult = fibo.getTerm(0);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void fibonacciTestSecondCorrect() {
        FibonacciEx fibo2 = new FibonacciEx();
        int expected = 1;
        int actualResult = fibo2.getTerm(1);

        Assert.assertEquals(expected,actualResult);
    }

//    @Test
//    public void fibonacciTestSecondCorrect() {
//        FibonacciEx fibo2 = new FibonacciEx();
//        int expected = 1;
//        int actualResult = fibo2.getTerm(1);
//
//        Assert.assertEquals(expected,actualResult);
//    }
//


}