package Functions_Methods;

public class BinaryTodecimal {

    public static void binTodec(int binNum) {
        int value = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("the decimal of " + value + " = " + decNum);
    }

    public static void main(String[] args) {
        binTodec(1111);

    }

}
