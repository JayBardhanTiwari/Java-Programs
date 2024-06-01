package ConditionalStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Pizza");

                break;
            case 2:
                System.out.println("Cold Drink");
                break;

            case 3:
                System.out.println("Mango shake");
                break;

            default:
                System.out.println("we wake up");

        }
    }
}
