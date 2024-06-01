package JavaBasics;

public class TypePromotion {
    public static void main(String[] args) {

        // Type Promotion
        // Condition for Type promotion
        // 1.Java automatically promotes each byte,short and char operand to int when
        // evaluating an expression.

        // char a = 'a';
        // char b ='b';
        // System.out.println((int) a);// type casting
        // System.out.println((int) b);
        // System.out.println(b - a); // here the a and b will convert it into int
        // automatically

        short s = 10;
        byte d = 10;
        char c = 'c';
        // byte bt = s + d + c; // here it is convert all the valure to int and int
        // cannot be converted into byte
        byte bt = (byte) (s + d + c); // so we have to type cast it to convert int to byte
        System.out.println(bt);

        // 2.If one operand is long , float or double the whole expression is promoted
        // to long , float or double respectively

        int num = 10;
        float price = 10.5f;
        double tag = 10;
        long big = 100;

        double ans = num + price + tag + big;
        System.out.println(ans);// here it will convert the values into double because it is largest one or big data type.

    }
}