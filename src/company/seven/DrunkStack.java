package seven;

import java.util.Stack;
import java.util.Scanner;


public class DrunkStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        FillStack(sc, p1);
        FillStack(sc, p2);
        boolean botva = true;
        for (int i = 0; i < 106; i++) {
            if (p1.isEmpty()) {
                System.out.println("second " + i);
                botva = false;
                break;
            }
            if (p2.isEmpty()) {
                System.out.println("first " + i);
                botva = false;
                break;
            }
            int first = p1.pop();
            int second = p2.pop();
            if (first > second) {
                PutBottom(p1, first, second);
            } else if (second > first) {
                PutBottom(p2, first, second);
            }
        }
        if (botva)
        {
            System.out.println("botva");
        }


    }

    public static void FillStack(Scanner sc, Stack<Integer> p) {
        Stack<Integer> reverse_stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            if (temp == 0) {
                temp = 10;
            }
            reverse_stack.push(temp);
        }
        for(int i = 0; i < 5; i++)
        {
            p.push(reverse_stack.pop());
        }
    }


    public static void PutBottom(Stack<Integer> p, int first, int second) {
        Stack<Integer> temp = new Stack<>();
        while (!p.isEmpty()) {
            temp.push(p.pop());
        }
        temp.push(first);
        temp.push(second);
        while (!temp.isEmpty()) {
            p.push(temp.pop());
        }
    }
}


