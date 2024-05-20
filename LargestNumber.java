public class LargestNumber {
    public static void main(String[] args) {
        int a= 14;
        int b= 88;
        int c = 100;
        if (a>b&&a>c){

            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.err.println(c);
        }
    }
    
}
