package Loops;

public class Example {
    public static void main(String[] args) {
        String name= "jaybardhantiwari";
        for(int i = 0;i<=name.length()-1;i++){
               if(name.charAt(i)=='a'){
                   char add ='c';
                   String add1= "" + i;
                   String new = "" + add;
                   String add2;
                   add2 = add;
                   add = add1;
                   add1 = add2;
                   System.out.println(add1);

                  // System.out.println(add1);
                   
                   
                   //System.out.println(i);
               }
           } 
    }
}
