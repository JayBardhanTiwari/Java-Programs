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

    // head n tail n Size
    public static Node head;
    public static Node tail;
    public static int size;

    // we dont need to make a func static because we r not calling direct func in
    // main func we are calling through objects which are static already

    public void addFirst(int data) {
        // step1 making a new node
        Node newNode = new Node(data);
        size++;
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
        size++;

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
        size++;

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

    public int removeFirst() {
        // base case
        if (size == 0) {
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        // base case
        if (size == 0) {
            System.out.println("linked is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        // iterate to find prev
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = head.data;// tail data
        // step 1
        prev.next = null;
        // step 2
        tail = prev;

        size--;
        return val;

    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {// key found
                return i;

            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public int helper(Node head, int key) {// helper function
        // base case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {// recursion function
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;// assignment in java right to left
        Node next;

        while (curr != null) {
            next = curr.next;// step 1
            curr.next = prev;// step 2
            prev = curr;// step 3
            curr = next;// step 4

        }
        head = prev;// last step curr becomes null so prev becomes head

    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        // base case
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        int iTofind = sz - n;
        while (i < iTofind) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;
    }

    // check if linked list is palindrome or not

    public Node findmid(Node head) {// healper function
        // slow - fast approach
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow is my middle Node

    }

    public boolean checkPalindrome() {

        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 find midNode
        Node midNode = findmid(head);

        // step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;

        // step 3 check if first half is equals to right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // initialization of linked list
        LinkedList ll = new LinkedList();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(15));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(15));
        // ll.reverse();
        // ll.print();

        // ll.deleteNthfromEnd(3);
        // ll.print();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());

    }

}
