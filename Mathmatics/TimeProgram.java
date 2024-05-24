package Mathmatics;
public class TimeProgram {
    public static void main(String[] args) {
        int time = 24;
        if (time < 12) {
            System.out.println(time + "am");
        } else if (time == 12) {
            System.out.println(time + "pm");
        } else if (time == 24) {
            System.out.println(time - 12 + "am");
        } else {

            System.out.println(time - 12 + "pm");
        }

    }

}
