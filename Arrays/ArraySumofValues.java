public class ArraySumofValues {
    public static void main(String[] args) {
        int largest[] = { 50, 7, 9, 12, 55, 78, 4, 0 };
        

        int temp=0;
        for(int i =0;i<largest.length;i++){
            temp = largest[i] + temp;
        
        }

        System.out.println(temp);

    }
}
