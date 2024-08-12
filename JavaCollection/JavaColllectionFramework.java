
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class JavaColllectionFramework {

    public static void main(String[] args) {

        // Things You know before learning java collection
        /*
         * 
         * package
         *  Interface
         * class
         * Wrapper class -->all primitive type
         * Generic -->wrapping primitive type <Integer> this is generic
         * Objects
         * Iterator --not need to know 
         * Collection--not need to know 
         * Arrays--not need to know 
         * Comparator--not need to know 

         */
        //then start from here
        //List --ordered collection and repeat value also can hold
        // ArrayList rules-->ordered collection of  stored value
        // non syncronized means  in multithreading u can change and input at same time means perform many function at same time
        //fast and not thread safe 
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 24);
        System.out.println("List : " + list);

        //LinkedList rules --> ordered collection 
        List linkedlList = new LinkedList<Integer>();
        linkedlList.add(1);
        linkedlList.add(2);
        linkedlList.add(1, 3);
        System.out.println("Linked list : " + linkedlList);

        //vector rules 
        //syncronized means one operation only at single time and it blocks other operation
        ///slow and thread safe 
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(14);
        System.out.println("Vactor : " + vector);

        //Stack --> ordered maintained must 
        // so vector is thread safe and synochronized thts why stack extends vector class
        //stack is LIFO
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.push(100);

        stack.pop();
        System.out.println("Stack : " + stack);
        System.out.println("Stack peek : " + stack.peek());

        //Set -- unordered collection and no duplicate value can store
        //only stores unique values 
        //HashSet 
        // same as set and hashing running in back makes its fast 
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(14);
        set.add(18);
        set.add(20);
        set.add(20);
        System.out.println("hashset : " + set);

        //LinkedHashset
        //ordered and unique value  and fast 
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(1);
        linkedhashset.add(2);
        linkedhashset.add(3);
        linkedhashset.add(4);
        linkedhashset.add(4);
        System.out.println("LinkedHashSet : " + linkedhashset);

        //SortedSet 
        //TreeSet
        //sorted order and increasing order 
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        treeset.add(20);
        treeset.add(8);
        treeset.add(10);
        treeset.add(2);
        treeset.add(12);
        treeset.add(12);

        System.out.println("TreeSet : " + treeset);

        //Quene -->FIFO --FirstInFirstOut
        //Priority first here
        //linkedlist through Queue
        //  front<--||||-->rear means back
        //so adding from rear side and removing from front side
        //for add = offer 
        //for remove =poll
        Queue<Integer> queue = new LinkedList<Integer>();
        //same work
        queue.add(10);
        queue.offer(20);
        queue.offer(25);
        queue.add(40);
        System.out.println("Quene : " + queue);
        System.out.println("Quene remove : " + queue.remove());
        System.out.println("Quene : " + queue);
        System.out.println("Quene poll : " + queue.poll());
        System.out.println("Quene : " + queue);
        //whats the difference here add n offer and poll n remove
        //using add method it will throw exception and using offer it will check value is add or not and reture true or false basis of tht
        // using remove method it will also throw exception and u have to handle it and use poll it retured null value

        // priority Queue-->binary tree structure backend and by default in java it create MIN HEAP
        //to change it to Max heap --> Use Comparator 
        // PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        // 
        pQueue.offer(12);
        pQueue.add(2);
        pQueue.add(8);
        pQueue.offer(20);
        System.out.println("Priority Queue : " + pQueue);
        System.out.println("Priority Queue peek: " + pQueue.peek());

        //DeQueue--> doublely ended Queue means add n remove operation perform from both ends 
        //ArrayDequeue
        Deque<Integer> arryDQuene = new ArrayDeque<Integer>();
        arryDQuene.offer(10);
        arryDQuene.offer(20);
        arryDQuene.offerLast(40);
        arryDQuene.pollLast();
        arryDQuene.offerFirst(50);
        System.out.println("ArrayDeque : " + arryDQuene);

        //Map 
        // here <key,Value> so key must be unique and value can be duplicate
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        hMap.put("First", 25);
        hMap.put("Second", 45);
        hMap.put("Third", 10);

        System.out.println("Hash Map : " + hMap);

        //Tree Map 
        //In Sorted Order and it is sorted the keys
        TreeMap<String, Integer> tMap = new TreeMap<String, Integer>();
        tMap.put("First", 25);

        tMap.put("Second", 45);
        tMap.put("Third", 10);
        System.out.println("TreeMap : " + tMap);

    }
}
