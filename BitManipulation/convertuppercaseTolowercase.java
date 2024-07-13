package BitManipulation;

public class convertuppercaseTolowercase {
    public static void main(String[] args) {

        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {

            System.out.print((char) (ch | ' ') + " ");
            // a b c d e f g h i j k l m n o p q r s t u v w x y z

        }
    }
}
