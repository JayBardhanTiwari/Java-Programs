public class PrintNumberwithGap {
    public static void main(String[] args) {
        for(int i = 0;i<=11;i++){
            for(int j=1;j<=i;j++){

                int gap=i-j;
                int temp= i-3;
                if(gap==3 && temp==0){
                    System.out.println(i);
                }
             
            }
          
        }
    }
    
}
