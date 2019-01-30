package checkNumberPrime;


import org.junit.Test;

import static org.junit.Assert.*;


public class NumberPrimeTest {
    @Test
    public void oneIsPrime(){
        assertTrue("1 should be a prime",Prime.isPrime(1));
    }

    @Test
    public void fourIsNotPrime(){
        assertFalse("4 should not be a prime", Prime.isPrime2(4));
    }
}