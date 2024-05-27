package Loops;

public class CharAtExample {
    public static void main(String[] args) {
        // Example 1
        String agent = "brimstone";
        char ch = agent.charAt(4);
        System.out.println("The value at index 4 is " + ch);

        // Example 2 first and last index
        String game = "Valorant";
        System.out.println("The value at index 0 is " + game.charAt(0));
        System.out.println("The value at last index is " + game.charAt(game.length() - 1));
        // Example 3 print odd index value in a String
        String duelist = "Reyna";
        for (int i = 0; i <= duelist.length() - 1; i++) {
            int value = i % 2;
            if (value != 0) {
                System.out.println("char at " + i + " place is " + duelist.charAt(i));
            }
        }
        // Example 4 count the repeated character in string
        String name = "valorant";
        int count = 0;
        for(int i = 0 ; i<=name.length()-1;i++){
            if(name.charAt(i)=='a'){
                count++;
                
            }
        }
        System.out.println(count);
    }
}
