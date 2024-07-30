package ArrayList;

import java.util.ArrayList;

public class ReverseinArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        // reverse array list -- O(n)
        for (int i = arrList.size() - 1; i >= 0; i--) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
    }
}
