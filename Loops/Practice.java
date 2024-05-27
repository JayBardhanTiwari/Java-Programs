package Loops;

public class Practice {
    public static void main(String[] args) {

        // Q1--Given a String Jaybardhan add tiwari to
        // it so output will be jaybardhantiwari

        String name = "Jaybardhan";
        String name2 = "tiwari";
        String add = name + name2;
        System.out.println(add);

        // Q2-- Replace ard and put rock to the string jaybardhantiwari
        // for(int i =0;i<=name.length()-1;i++){
        // if(name.charAt(i)=='r'){
        // String store= "" + i;
        // String name3 = store;
        // String c = "dd";
        // store = c;
        // }
       // public String replaceAll(String regex, String replacement)
            String regex = "bar";
            System.out.println(name.replaceAll(regex , "rock"));
        // }

        // Q3--Find the count of letter a in jaybardhantiwari.

        int count = 0;
        for (int i = 0; i <= name.length() - 1; i++) {
            if (name.charAt(i) == 'a') {
                count++;

            }
        }
        System.out.println(count);
        
        // Q4-- Replace a with c in the string jaybardhantiwari.
        //public String replace(char searchChar, char newChar) ==syntax
        System.out.println(name.replace('a', 'c'));

    }
}
