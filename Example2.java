public class Example2 {

    // array
    public static void getArray(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        getArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // subsets of string
    public static void subString(String str , String ans,int i ){
        //base case 
        if(str.length() == i){
            System.out.println(ans);
            return;
        }

        // recursion 
        //yes 
       subString(str, ans+str.charAt(i),i+1);
       subString(str, ans,i+1);
    }

    // permutation

    public static void main(String[] args) {

        // int arr[] = new int[5];
        // getArray(arr, 0, 1);
        // printArr(arr);
        String str = "abc";
        subString(str, "",0);

    }
}
