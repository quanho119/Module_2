import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nam",20,"HN");
        Student s2 = new Student("Hung",21,"HN");
        Student s3 = new Student("Ha",22,"HN");
        Map<Integer,Student> map = new HashMap<Integer,Student>();
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        map.put(4,s1);
        for(Map.Entry<Integer,Student> entry : map.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println("Set");
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s1);
        for(Student student : set){
            System.out.println(student.toString());
        }
    }
}