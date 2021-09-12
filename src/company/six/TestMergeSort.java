package six;
import java.util.ArrayList;
import java.util.List;

public class TestMergeSort {
//    private static void printArray(List<Student> students) {
//        for (int i = 0; i < 4; i++) {
//            System.out.println(students[i]);
//        }
//    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<Student>();
        students1.add(new Student("Alesha", "IKBO-02-10", 3, 3, 3));
        students1.add(new Student("Kolya", "IKBO-02-30", 3, 5, 4));
        students1.add(new Student("Petya", "IKBO-02-20", 3, 104, 5));
        students1.add(new Student("Sasha", "IKBO-02-50", 3, 4, 3));

        List<Student> students2 = new ArrayList<Student>();
        students2.add(new Student("Alesha", "IKBO-02-10", 3, 5, 3));
        students2.add(new Student("Kolya", "IKBO-02-30", 3, 6, 3));
        students2.add(new Student("Petya", "IKBO-02-20", 3, 10, 3));
        students2.add(new Student("Sasha", "IKBO-02-50", 3, 11, 3));

        List<Student> students3 = new ArrayList<Student>();
        students3.addAll(students1);
        students3.addAll(students2);
        System.out.println(students3);
        System.out.println(students3);

    }
}
