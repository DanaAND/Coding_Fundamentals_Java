package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void getStack() {

        Stack zStack = new Stack(4);

        System.out.println(zStack);
        zStack.push(5);
        System.out.println(zStack);
        zStack.push(9);
        System.out.println(zStack);
        zStack.push(15);
        System.out.println(zStack);
        zStack.push(20);
        System.out.println(zStack);
        zStack.push(2);
        System.out.println(zStack);

//    System.out.println(zStack.pop());
//    System.out.println(zStack);
//
//    System.out.println(zStack.pop());
//}

    }

}