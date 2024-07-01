// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int asciiValue(String sc){
        int asciivalue = 0;
        int total = 0;
        for(int i = 0 ; i < sc.length()-1;i++){
            asciivalue = (int)sc.charAt(i) - (int)sc.charAt(i+1);        
             total += Math.abs(asciivalue);
            

        }
        return total;
    }
    public static void main(String[] args) {
        String sc = "zaz";
        System.out.println(asciiValue(sc));
        
    }
}