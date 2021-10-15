package eighteen;

public class first {

    public static int fact(int n)
    {
        if(n < 0 || n > 16) {
            System.out.println("Ввели число меньше 0 или больше 16 :(");
            return -1;
        }
        int res = 1;
        for(int i = 1; i <= n; i++)
        {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(fact(0));
        System.out.println(fact(1));
        System.out.println(fact(2));
        System.out.println(fact(3));
        System.out.println(fact(4));
        System.out.println(fact(5));
        System.out.println(fact(7));
        System.out.println(fact(125));
    }
}
