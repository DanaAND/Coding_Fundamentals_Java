package bubbleSort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void getBubbleSort () {
        int a [] = {7,5,4,9,5,3};

        BubbleSort nBubble = new BubbleSort();

        int [] b = nBubble.bubbleSort(a);

        System.out.println(Arrays.toString(a));
    }

}