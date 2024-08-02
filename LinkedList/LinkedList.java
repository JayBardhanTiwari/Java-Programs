package LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // head n tail
    public static Node head;
    public static Node tail;

    // we dont need to make a func static because we r not calling direct func in
    // main func we are calling through objects which are static already

    public void addFirst(int data) {
        // step1 making a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 newNode next point to head
        newNode.next = head;

        // step3 head = newNode
        head = newNode;

    }

    public void addLast(int data) {
        // step 1 making a new node
        Node newNode = new Node(data);

        // when empty head
        if (head == null) {
            head = tail = newNode;
        }

        // step 2 tail next point to newNode
        tail.next = newNode;

        // step 3 newNode become tail
        tail = newNode;
    }

    public static void main(String[] args) {
        // initialization of linked list
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

    }

}
