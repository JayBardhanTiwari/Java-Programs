package Mathmatics;

public class BODMAS {
    public static void main(String[] args) {
        int num = 5;
        int num2 = 3;
        num = ++num + ++num;
        System.out.println(num);

        // int i = 4 / 3 * 2;
        int i = 20 + -3 * 5 / 8; // 19
        int j = 5 + 15 / 3 * 2 - 8 % 3; // 13
        System.out.println(i);
        System.out.println(j);

    }

}
// B O D M A S
// Bracket = Parenthesis and symbol = ()
// Order =(powers/indices or roots)
// Division = symbol = /
// Multiplication = *
// Addition = +
// Substraction = -
// P E M D A S
// P: Parenthesis
// E: Exponent
// M: Multiplication (whichever comes first between M and D)
// D: Division
// A: Addition
// S: Subtraction (whichever comes first between A and S)
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
// Rule = In precedence order if operator of same family( * / % =
// multiplicative)
// comes then the left one will be excuted first followed by right
