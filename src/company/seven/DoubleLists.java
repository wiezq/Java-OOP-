package seven;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DoubleLists {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        ArrayDeque<Integer> a2 = new ArrayDeque<>();

        fillDoubleList(a1);
        fillDoubleList(a2);

        boolean botva = true;
        for (int i = 0; i < 106; i++)
        {
            if (a1.isEmpty()) {
                System.out.println("second " + i);
                botva = false;
                break;
            }
            if (a2.isEmpty()) {
                System.out.println("first " + i);
                botva = false;
                break;
            }
            int first = a1.pollFirst();
            int second = a2.pollFirst();
            if(first > second)
            {
                a1.offerLast(first);
                a1.offerLast(second);

            }
            else if (second > first)
            {
                a2.offerLast(first);
                a2.offerLast(second);

            }

        }
        if (botva)
        {
            System.out.println("botva");
        }

    }

    public static void fillDoubleList(ArrayDeque<Integer> d)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            int temp = sc.nextInt();
            if(temp == 0)
            {
                temp = 10;
            }
            d.addLast(temp);
        }
    }
}