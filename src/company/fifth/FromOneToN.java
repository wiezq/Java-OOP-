package fifth;

public class FromOneToN {
    public static void rec(int start, int n)
    {
        if(n >= start)
        {
            System.out.println(start);
            rec(++start, n);
        }
    }

    public static void main(String[] args) {
        rec(1,10);
    }
}
