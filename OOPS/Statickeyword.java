package OOPS;

public class Statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ABC";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "XYZ";

        System.out.println(Student.getPercentage(78, 89, 90));

    }
}

class Student {
    String name;
    int rollno;

    static String schoolName;

    static int getPercentage(int chem, int math, int phys) {
        return (chem + math + phys) / 3;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
}
