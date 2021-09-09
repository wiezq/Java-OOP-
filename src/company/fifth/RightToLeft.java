package fifth;

import java.util.Scanner;

public class RightToLeft {

    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("n = " + n);
        System.out.print("Reversed: ");
        Rev(n);
    }
    public static int Rev(int n)
    {
        if (n == 0) return 0;
        System.out.print(n%10 + " ");
        return Rev(n/10);
    }
}
