package Strings.Questions;

class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++")) {
                count++;
            } else if (operations[i].equals("++X")) {
                ++count;
            } else if (operations[i].equals("X--")) {
                count--;
            } else {
                --count;
            }
        }
        return count;
    }

    public static int optimized(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                X++;
            } else if (operations[i].equals("X--") || operations[i].equals("--X")) {
                X--;
            }
        }
        return X;

    }

    public static void main(String[] args) {
        String operation[] = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(operation));
        System.out.println(optimized(operation));
    }
}