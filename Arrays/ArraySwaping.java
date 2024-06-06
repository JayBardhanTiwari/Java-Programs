public class ArraySwaping {
    public static void main(String args[]) {

        int five[] = new int[5];
        five[0] = 100;
        five[1] = 2;
        five[2] = 54;
        five[3] = 6;
        five[4] = 9;

        int tablearr[] = new int[10];

        for (int a = 1; a < 11; a++) {

            int val = a * 2;

            tablearr[a - 1] = val;

        }
        // 0 1 2 3 4 5 6 7 8 9
        /* [2, 4, 6, 8, 10, 12, 14, 16, 18, 20] */
        // int temp=tablearr[0];
        // tablearr[0]=tablearr[9];
        // tablearr[9]=temp;//

        /* [20, 4, 6, 8, 10, 12, 14, 16, 18, 2] */
        /* [20, 18, 6, 8, 10, 12, 14, 16, 4, 2] */
        /*
         * [20, 18, 16, 8, 10, 12, 14, 6, 4, 2] *
         * /*[20, 18, 16, 14, 10, 12, 8, 6, 4, 2]
         */
        /* [20, 18, 16, 14, 12, 10, 8, 6, 4, 2] */

        for (int j = 0; j < 10 / 2; j++) {

            int temp = tablearr[j];
            tablearr[j] = tablearr[9 - j];
            tablearr[9 - j] = temp;
        }
        System.out.print("\n ");
        for (int a = 0; a < 10; a++) {
            System.out.print(tablearr[a]);
            System.err.print(" ");
        }

    }
}

