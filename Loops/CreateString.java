package Loops;

public class CreateString {
    public static void main(String[] args) {

        String s = "valorant";// string literal
        String agent = new String("jett");// creating a string by new keyword
        char[] sentinal = { 'c', 'y', 'p', 'h', 'e', 'r' };
        String ch = new String(sentinal);// converting char array to string
        System.out.println(s);
        System.out.println(agent);
        System.out.println(ch);
    }

}
