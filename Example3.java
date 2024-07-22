
public class Example3 {

    // drecreasing from n to 1
    public static void printDec(int n) {
        // base
        if (n == 1) {
            System.out.println(n);
            return;

        }
        System.out.println(n);
        printDec(n - 1);

    }

    // increasing from 1 to n ;
    public static void printInc(int n) {
        // base case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);

    }

    // factorial of a num

    public static int findFac(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = findFac(n-1);
        // int fac = n * fnm1;
        // return fac;
        return n * findFac(n - 1);
    }

    // sum of natural number
    public static int sumofNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = sumofNatural(n - 1);
        int natural = n + fnm1;

        return natural;
    }

    // fibonacci number
    public static int findFibonacci(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = findFibonacci(n - 1);
        int fnm2 = findFibonacci(n - 2);
        int fac = fnm1 + fnm2;

        return fac;
    }

    // check array is sorted or not
    public static boolean isSorted(int i, int arr[]) {
        // base case
        if (i == arr.length) {
            return true;
        }
        // kaam
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(i + 1, arr);
    }

    // first occurence in array
    public static int firsOccurence(int i, int key, int arr[]) {
        // base case
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firsOccurence(i + 1, key, arr);
    }

    // last occurence in array
    public static int lastOccurence(int i, int key, int arr[]) {
        // base case
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(i + 1, key, arr);
        if (isFound != -1) {
            return isFound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // print x ^ n
    public static int printPower(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        int power = printPower(x, n - 1);
        int total = x * power;
        return total;
    }

    // print x ^ n optimized
    public static int printpowerOptimized(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // even
        int power = printpowerOptimized(x, n / 2);
        int powersq = power * power;
        // odd case
        if (n % 2 != 0) {
            powersq = x * powersq;

        }
        return powersq;
    }

    // tiling problem
    public static int printTiles(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical tiles
        int vertical = printTiles(n - 1);
        // horizontal tiles
        int horizontal = printTiles(n - 2);
        int total = vertical + horizontal;

        return total;
    }

    // remove duplicate in a string
    public static void removeDuplicate(String str, StringBuilder sb, int i, boolean map[]) {
        // base case
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(i);

        if (map[ch - 'a'] == true) {
            removeDuplicate(str, sb, i + 1, map);
        } else {
            map[ch - 'a'] = true;
            removeDuplicate(str, sb.append(ch), i + 1, map);
        }

    }

    // friends problem 
    public static int printWays(int n){
        // base case 
        if(n == 1 || n == 2){
            return n;
        }
        // single 
        int fnm1 = printWays(n-1);
        // paired
        int fnm2 = printWays(n-2);

        int total = fnm1 + (n-1) * fnm2;
        return total;
    }

    public static void main(String[] args) {
        // recursion
        // printDec(5);
        // printInc(5);
        // System.out.println(findFac(5));
        // System.out.println(sumofNatural(10));
        // System.out.println(findFibonacci(10));
        // int arr[] = { 1, 3, 2, 4, 5, 2 ,3};
        // System.out.println(isSorted(0, arr));
        // System.out.println(firsOccurence(0, 2, arr));
        // System.out.println(lastOccurence(0, 3, arr));
        // System.out.println(printPower(3, 3));
        // System.out.println(printTiles(4));
        // String str = "jaaybaardhhantiwarii";
        // removeDuplicate(str, new StringBuilder(""), 0, new boolean[26]);
        System.out.println(printWays(3));
    }
}
