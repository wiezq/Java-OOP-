package fifth;
import java.util.Scanner;
public class FindMaxElem {

    public static int recursion() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, recursion());
        }
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число в последовательности: " + recursion());
    }
}
