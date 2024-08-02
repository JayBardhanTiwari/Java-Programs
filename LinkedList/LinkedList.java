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

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        // base case
        if (idx == 0) {
            addFirst(data);
            return;

        }
        while (i < idx - 1) {// i = prev node
            temp = temp.next;
            i++;
        }

        // step 1
        newNode.next = temp.next;

        // step 2
        temp.next = newNode;
    }

    public static void main(String[] args) {
        // initialization of linked list
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.add(2, 9);
        ll.print();

    }

}
