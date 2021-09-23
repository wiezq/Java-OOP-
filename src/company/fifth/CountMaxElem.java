package fifth;

public class CountMaxElem {
    public static void recursion(int max, int count) {
        System.out.print("Введите число: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай 
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                recursion(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                recursion(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                recursion(max, count);
            }
        } else {
            System.out.println("Количество максимальных элементов: " + count);
        }
    }

    public static void main(String[] args) {
        recursion(0, 0);
    }

}
