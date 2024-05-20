public class AdditionOfTable {
 

    public static void main(String[] args){
        for(int i=1; i<11; i++){
            int even=0;
            even =2*i;
            System.out.println(even);
            

        }
        for(int i=1; i<11; i++){
           
            int odd=0;
            odd =3*i;
            System.out.println(odd);
           
        }
        int sum=0;
       for(int i = 1; i<11; i++){
            int table2= 2*i;
            int table3= 3*i;
             sum = table2 + table3;
       }
        
        System.out.println(sum);
    }
    
}
