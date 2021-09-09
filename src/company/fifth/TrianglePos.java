package fifth;
import java.util.Scanner;

public class TrianglePos {

    public static String recursion(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай 
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(recursion(--n) + " " + j);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }
    
}
