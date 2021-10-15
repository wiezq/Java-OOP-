package seven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkQueue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        fillQueue(queue1);
        fillQueue(queue2);

        boolean botva = true;
        for (int i = 0; i < 106; i++)
        {
            if (queue1.isEmpty()) {
                System.out.println("second " + i);
                botva = false;
                break;
            }
            if (queue2.isEmpty()) {
                System.out.println("first " + i);
                botva = false;
                break;
            }
            int first = queue1.poll();
            int second = queue2.poll();
            if(first > second)
            {
                queue1.offer(first);
                queue1.offer(second);
                System.out.print("first: ");
                System.out.println(queue1);
                System.out.print("second: ");
                System.out.println(queue2);
            }
            else if (second > first)
            {
                queue2.offer(first);
                queue2.offer(second);
                System.out.print("first: ");
                System.out.println(queue1);
                System.out.print("second: ");
                System.out.println(queue2);
            }

        }
        if (botva)
        {
            System.out.println("botva");
        }
    }
    public static void fillQueue(Queue<Integer> queue)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            int temp = sc.nextInt();
            if (temp == 0)
            {
                temp = 10;
            }
            queue.offer(temp);
        }
    }
}


