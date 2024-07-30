package ArrayList;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // declaration of ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();

        // operation in ArrayList

        // 1.Add element -- O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        // Another special funtion for add element
        list.add(2, 18);
        System.out.println(list);

        // 2.Get element -- O(1)
        System.out.println(list.get(2));

        // 3.Remove element -- O(n)
        list.remove(2);
        System.out.println(list);

        // 4.Set element -- O(n)
        list.set(2, 12);
        System.out.println(list);

        // 5.Contains element -- O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(15));

    }

}
