package six;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        if (a.getGPA() == b.getGPA()) {
            return 0;
        } else if (a.getGPA() < b.getGPA()) {
            return 1;
        } else {
            return -1;
        }
    }

}
