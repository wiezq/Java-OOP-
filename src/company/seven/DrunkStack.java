package seven;

import java.util.Stack;
import java.util.Scanner;


public class DrunkStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack p1 = new Stack();
        Stack p2 = new Stack();
        FillStack(sc, p1);
        FillStack(sc, p2);
        PrintStack(p1);
        PrintStack(p2);

    }

    public static void FillStack (Scanner sc, Stack p) {
        for (int i = 0; i < 5; i++)
        {
            int temp = sc.nextInt();
            p.push(temp);
        }
    }

    public static void PrintStack(Stack p)
    {
        while (!p.isEmpty())
        {
            System.out.print((int) p.pop() + " ");
        }
        System.out.println();
    }
}


