package stack;

import java.util.Arrays;

//LIFO = last in first out
public class Stack {
    private int top; // index of the last element;
    private int[] elements; //a place to store the data;
    private int size; //size of the elements array

    public Stack(int size) {
        this.size = size;
        this.elements = new int[this.size];
        this.top = -1;
    }

//    Stack bStack = new Stack(2);

    public void push(int element) { //adds ements to stack
        if (top + 1 == size) {
            System.out.println("Stack is full!");
            return;
        }
        elements[top + 1] = element;
        top++;
    }

    public int pop() { // removes elemts from stack and returns it
        if (top < 0) {
            System.out.println("Stack is empty!");
            int invalidValue = -1;
            return invalidValue;
        }
        int elementRemove = elements[top];
        elements[top] = 0;
        top--;
        return elementRemove;
    }

    public int peek() { // display the element from the top of the stack
        return elements[top];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
