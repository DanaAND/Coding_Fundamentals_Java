package checkNumberPrime;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFromArrayTest {
    PrimeFromArray no = new PrimeFromArray();
    @Test
    public void getPrime () {

        int [] newArray = {2,5,7,8,5,3};

        List expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(5);
        expected.add(7);
        expected.add(5);
        expected.add(3);

        ArrayList actual = PrimeFromArray.findPrime(newArray);
        assertEquals(expected, actual);
    }

}