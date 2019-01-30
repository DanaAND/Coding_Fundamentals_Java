package linkedList;

import org.junit.Test;

public class TestMyLinkedList {

    @Test

    public void test() {
        Node first = new Node(5);
        MyLinkedList linkedList = new MyLinkedList(first);
        linkedList.insertHead(3);
        linkedList.insertLast(0);
        linkedList.insertAfter(first, 9);
        linkedList.printList();

        Node second = new Node(8);
        linkedList.insertAfter(second, 1);

        boolean contains = linkedList.listContains((first));
        System.out.println(contains);
        boolean cont = linkedList.listContains(second);
        System.out.println(cont);


    }


}