package OperatorsInJava;
public class PrintNumberwithGap {
    public static void main(String[] args) {

        int num = 1;
        int total = 20;
        /*
         * while (num <= total) {
         * System.out.print(num);
         * System.out.println();
         * // num += 3;
         * num = num + 3;
         */
        // }
        for ( ; num <= total; ) {
            System.out.print(num);
            System.out.println();
             num = num + 3;

        }
        // for(int num=1;num<=total;num=num+3){
        //     System.out.println(num);
        //     System.out.println();
        //  } 

        
        //   for(int num=1;num<=total;num+=3){
        //     System.out.println(num);
        //     System.out.println();
         
    }

}
