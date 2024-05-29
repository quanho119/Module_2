import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }
        else if(o1.getAge() < o2.getAge()){
            return -1;
        }
        return 0;
    }
}
