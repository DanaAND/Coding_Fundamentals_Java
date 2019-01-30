package linkedList;

public class MyLinkedList {

    Node head;
    Node after;

    public MyLinkedList(Node head) {
        this.head = head;
    }


    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void insertHead(int dataToBeInserted) {
        Node newNode = new Node(dataToBeInserted);
        newNode.next = head;
        this.head = newNode;
    }

    public void insertLast(int last) {

        Node twoNode = new Node(last);
        if (head == null) {
            this.head = twoNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = twoNode;
    }

    public void insertAfter(Node after, int data) {
// METODA 1
//        Node newNode2 = head;
//        while (newNode2 != null && newNode2.data != after.data) {
//            newNode2 = newNode2.next;
//        }
//        if (newNode2 == null) {
//            System.out.println("Node not in list!");
//            return;
//        }
//        Node nodeC = newNode2.next;
//        Node nodeToadd = new Node(data);
//        newNode2.next = nodeToadd;
//        nodeToadd.next = nodeC;
//
// METODA 2 (mai simpla)
        if (listContains(after) ){
            Node newNode = new Node(data);
            newNode.next = after.next;
            after.next = newNode;
        }else {
            System.out.println("Node" + after.data + " does not exist");
        }

    }

    boolean listContains(Node n) {
        boolean contains = false;
        Node newNode2 = head;

        while (newNode2 != null && newNode2.data != n.data) {
            newNode2 = newNode2.next;
        }
        if (newNode2 != null) {
            contains = true;
        }

        return contains;
    }

}
