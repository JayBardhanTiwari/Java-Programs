package JavaBasics;

public class TypeCaasting {
    public static void main(String[] args) {

        // Type casting
        // Jva does not allow it but we do it forcefully and we are tring to convert it
        // into samll values and some data will be lost
        // which is known as lossy conversion.

        float a = 10.5f;

        // int b= a ; it doesnt convert it
        // so for that we have to type cast it to convert in int
        int b = (int) a;
        System.out.println(b);
        // But remember after decimal values the data will be lost and it stores only 10
        // .

    }
}
