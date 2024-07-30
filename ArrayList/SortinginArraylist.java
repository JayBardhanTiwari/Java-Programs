package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortinginArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(8);

        System.out.println(list);
        // this function sort the list in ascending order
        Collections.sort(list);
        System.out.println(list);

        // This function sort the list in descending order
        // this is a Comparator which is a function with logic defined in it
        // By default .sort function sort in ascending order but here
        // .reverseorder() is comparator whose change the logic of sorting
        // in reverse order means descending order

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
