// package six;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.List;

// public class TestTest {
//     public static void selectionSort (Comparable[] list) {
//         int min;
//         Comparable temp;
//         for (int index = 0; index < list.length-1; index++)
//         {
//         min = index;
//         for (int scan = index+1; scan < list.length; scan++)
//         if (list[scan].compareTo(list[min]) < 0)
//         min = scan;
//         temp = list[min];
//         list[min] = list[index];
//         list[index] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         Comparable s1 = new Student("Alesha", "IKBO-02-20", 3,213);
//         Comparable s2 = new Student("Kusha", "IKBO-03-20", 3,9123);
//         Comparable s3 = new Student("petya", "IKBO-04-20", 3,2452);
//         Comparable s4 = new Student("Kolya", "IKBO-05-20", 3,123921);
//         students.add(s1);
//         students.add(s2);
//         students.add(s3);
//         students.add(s4);
//         System.out.println("Before Sorting : " + students);
//         selectionSort(students);
//         System.out.println("After sorting : " + students);

//     }
    
// }
