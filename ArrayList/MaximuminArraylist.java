package ArrayList;

import java.util.ArrayList;

public class MaximuminArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(22);
        list.add(12);
        list.add(16);
        list.add(6);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            // basic approach
            // if(max<list.get(i)){
            // max = list.get(i);
            // }

            // another approach
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum element = " + max);
    }
}
