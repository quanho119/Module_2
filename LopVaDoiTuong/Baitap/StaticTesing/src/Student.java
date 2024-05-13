public class Student {
    private int rollno;
    private String name;
    private static String collage="BBDIT";
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change()
    {
        collage = "codegym";
    }
    void display()
    {
        System.out.println(rollno + " " + name + " " + collage);
    }
}
