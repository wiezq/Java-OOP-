package seven;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkDeque {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>();
        Deque<Integer> d2 = new ArrayDeque<>();



        fillDeque(d1);
        fillDeque(d2);

        boolean botva = true;
        for (int i = 0; i < 106; i++)
        {
            if (d1.isEmpty()) {
                System.out.println("second " + i);
                botva = false;
                break;
            }
            if (d2.isEmpty()) {
                System.out.println("first " + i);
                botva = false;
                break;
            }
            int first = d1.pollFirst();
            int second = d2.pollFirst();
            if(first > second)
            {
                d1.offerLast(first);
                d1.offerLast(second);

            }
            else if (second > first)
            {
                d2.offerLast(first);
                d2.offerLast(second);

            }

        }
        if (botva)
        {
            System.out.println("botva");
        }

    }

    public static void fillDeque(Deque<Integer> deque)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            int temp = sc.nextInt();
            if (temp == 0)
            {
                temp = 10;
            }
            deque.offerLast(temp);
        }
    }
}
