package JavaBasics;

public class TypeConversion {
    public static void main(String[] args) {

        // for type conversion there are two condition you have to follow
        // 1.Type Compatible
        // 2.Destination type > Source type

        int a = 10;
        float b = a;
        System.out.println(b); // it is possible int stores 4 byte and float stores 8 bytes

        // Remember this , byte can convert to any of them in the row from left to right
        // but
        // double cannt be converted in byte or any from right to left
        // byte--> short--> int--> float--> long--> double

    }
}
