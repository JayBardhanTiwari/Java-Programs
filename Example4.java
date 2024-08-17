import java.util.*;

public class Example4 {
    public static void swap(ArrayList<Integer> list2, int idx1, int idx2) {
        // swaping
        int temp = list2.get(idx1);
        list2.set(idx1, list2.get(idx2));
        list2.set(idx2, temp);

    }

     public static int calWater(ArrayList<Integer> height){

     brute force

     int maxWater = 0;

    for(int i =0;i<height.size();i++){
     for(int j=i+1;j<height.size();j++){
    int ht = Math.min(height.get(i),height.get(j));
    int width = j-i;

    int currWater = ht * width;

     maxWater = Math.max(maxWater, currWater);
     }
    }
     return maxWater;

    }
    public static int calWater(ArrayList<Integer> height) {

        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;

            int currWater = ht * width;

            maxWater = Math.max(maxWater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }

    public static void main(String[] args) {
        // initialiazation

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(calWater(height));

        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // // insert values
        // for (int i = 1; i <= 5; i++) {
        // list.add(i * 1);
        // list2.add(i * 2);
        // list3.add(i * 3);
        // }
        // mainlist.add(list);
        // mainlist.add(list2);
        // mainlist.add(list3);
        // System.out.println(mainlist);
        // for (int i = 0; i < mainlist.size(); i++) {
        // // System.out.print(mainlist.get(i));
        // ArrayList<Integer> currList = mainlist.get(i);

        // for (int j = 0; j< currList.size(); j++) {
        // System.out.print(currList.get(j) + " ");
        // }
        // System.out.println();

        // }

        // list2.add(10);/

        // int max = Integer.MIN_VALUE;
        // int idx1 = 1;
        // int idx2 = 4;
        // System.out.println(list2);
        // swap(list2, idx1, idx2);
        // System.out.println(list2);
        // //sorting in ascending order
        // Collections.sort(list2);
        // System.out.println(list2);

        // // sorting in descending order
        // Collections.sort(list2, Collections.reverseOrder());
        // System.out.println(list2);

        // // operation
        // // 1. Add
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);

        // // 2.get
        // System.out.println(list.get(0));

        // // 3. remove
        // System.out.println(list.remove(2));
        // System.out.println(list);

        // //4.set
        // list.set(3, 10);
        // System.out.println(list);

        // //5.contain
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(12));
        // // special case
        // list.add(0, 20);
        // System.out.println(list);

        // for (int i = list2.size() - 1; i >= 0; i--) {
        // System.out.print(list2.get(i) + " ");

        // if (max < list2.get(i)) {
        // max = list2.get(i);
        // }
        // }
        
        // System.out.println(max);

        // }
    }

}
