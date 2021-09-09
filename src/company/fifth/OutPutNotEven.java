package fifth;

import java.util.Scanner;


public class OutPutNotEven {

    public static void recursion13(int count)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (count % 2 != 0)
        {
            System.out.println("Not even " + n);
        }
        recursion13(++count);
    }

    public static void recursion12()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                recursion12();
            } else {
                recursion12();
            }
        }
    }
    public static void main(String[] args) {
        // recursion13(1);
        recursion12();
    }
}
