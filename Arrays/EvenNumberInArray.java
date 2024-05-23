public class EvenNumberInArray {
    public static void main(String[] args) {
        
        int largest[] = { 50, 7, 9, 12, 55, 78, 4, 0 };
        int temp=0;
        for(int i=0;i<largest.length;i++){
            if(largest[i]==0){
                temp= largest[i]%2;
                System.out.println("its even"+temp);
            }
            else{
                System.out.println("not even");
            }


        }
    

    }
}
