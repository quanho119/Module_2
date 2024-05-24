import file.Student;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        Scanner sc = new Scanner(System.in);
        int choice=0;
        while(choice != 6) {
            System.out.println("1: Create new student:");
            System.out.println("2: Show list student:");
            System.out.println("3: Remove student:");
            System.out.println("4: Show student by index:");
            System.out.println("5: Update student:");
            System.out.println("6: Exit:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter id:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter age:");
                    int age = Integer.parseInt(sc.nextLine());
                    Student student = new Student(id, name, age);
                    students.add(student);
                    break;
                case 2:
                    Iterator<Student> iterator = students.iterator();
                    while (iterator.hasNext()) {
                        Student item = iterator.next();
                        System.out.println(item);
                    }
                    break;
                case 3:
                    System.out.println("Enter index:");
                    int indexRemove = Integer.parseInt(sc.nextLine());
                    students.remove(indexRemove);
                    break;
                case 4:
                    System.out.println("Enter id: ");
                    int indexShow = Integer.parseInt(sc.nextLine());
                    System.out.println(students.get(indexShow));
                    break;
                case 5:
                    System.out.println("Enter index: ");
                    int indexUpdate = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter id:");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name:");
                    String nameUpdate = sc.nextLine();
                    System.out.println("Enter age:");
                    int ageUpdate = Integer.parseInt(sc.nextLine());
                    Student studentUpdate=new Student(idUpdate,nameUpdate,ageUpdate);
                    students.set(indexUpdate,studentUpdate);
                    break;
                default:
                    break;
            }
        }
    }
}