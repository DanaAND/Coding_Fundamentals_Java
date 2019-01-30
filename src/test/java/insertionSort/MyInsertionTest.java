package insertionSort;

import fifo.MyQueue;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyInsertionTest {

    @Test
    public void getInsertion () {

        MyInsertion insert = new MyInsertion();

        int a[] = {7, 5, 4, 9, 3};

        insert.insertionSort(a);

        System.out.println(Arrays.toString(a));

    }
}