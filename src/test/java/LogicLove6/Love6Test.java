package LogicLove6;

import org.junit.Test;

import static org.junit.Assert.*;

public class Love6Test {
    Love6 sum = new Love6();
    @Test
    public void add() {
        assertEquals(true, sum.add(6,0) );
    }
}