package six;

import java.util.*;
import java.util.Collections;


public class TestStudent {

    public static Student[] mergeArray(Student[] s1, Student[] s2)
    {
        Student[] s3 = new Student[s1.length + s2.length];
        int i=0, j=0, k=0;
        while(i < s1.length && j < s2.length) {
            s3[k++] = (s1[i].compareTo(s2[j]) < 0) ? s1[i++] : s2[j++];
        }
        if(i < s1.length) {
            System.arraycopy(s1, i, s3, k, s1.length - i);
        } else if(j < s2.length) {
            System.arraycopy(s2, j, s3, k, s2.length - j);
        }
        return s3;
    }


    public static void selectionSort(Student[] list) {
        int min;
        Student temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static Student[] qsort(Student[] array, int left, int right, Comparator<Student> comp) {
        int ll = left;
        int rr = right;

        if (rr > ll) {
            Student pivot = array[(ll + rr) / 2];
            while (ll <= rr) {
                // that's how we'll use the comparator:
                while (ll < right && comp.compare(array[ll], pivot) < 0) {
                    ll += 1;
                }
                while (rr > left && comp.compare(array[rr], pivot) > 0) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    swap(array, ll, rr);
                    ll += 1;
                    rr -= 1;
                }
            }
            if (left < rr) {
                qsort(array, left, rr, comp);

            }
            if (ll < right) {
                qsort(array, ll, right, comp);
            }
        }
        return array;
    }


    private static void printArray(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static void swap(Comparable[] arr, int l, int r) {
        Comparable t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

    public static void main(String[] args) {
        Comparator<Student> comp = new SortingStudentsByGPA();
        Student[] students = new Student[4];
        students[0] = new Student("Alesha", "IKBO-02-20", 3, 4, 1);
        students[1] = new Student("Alesh", "IKBO-02-22", 3, 3, 2);
        students[2] = new Student("Ales", "IKBO-02-23", 3, 2, 3);
        students[3] = new Student("Ale", "IKBO-02-24", 3, 1, 5);
        System.out.println("Before selectionSorting : "); // Сортировка выбором по id
        printArray(students);
        selectionSort(students);
        System.out.println("After sorting selectionSorting : ");
        printArray(students);

//        System.out.println("Before qSort : "); // Быстрая сортировка по GPA с использованием компаратора SortingStudentsByGPA
//        printArray(students);
//        qsort(students, 0, students.length - 1, new SortingStudentsByGPA());
//        System.out.println("After sorting qsortSorting : ");
//        printArray(students);

        Student[] students2 = new Student[4];
        students2[0] = new Student("Alesha2", "2IKBO-02-20", 3, 10, 1);
        students2[1] = new Student("Alesh2", "2IKBO-02-22", 3, 9, 2);
        students2[2] = new Student("Ales2", "2IKBO-02-23", 3, 8, 3);
        students2[3] = new Student("Ale2", "2IKBO-02-24", 3, 7, 5);


        System.out.println("Before selectionSorting : "); // Сортировка 2 массива
        printArray(students2);
        selectionSort(students2);
        System.out.println("After sorting selectionSorting : ");
        printArray(students2);


        System.out.println("Students3: ");
        Student[] students3 = mergeArray(students,students2); // Слияние двух отсортированных списков
        printArray(students3);

    }


}
