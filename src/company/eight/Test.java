package eight;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class Test {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();



        UnfairWaitList<String> Uwl = new UnfairWaitList<>();
        Uwl.add("Aboba 1");
        Uwl.add("Aboba 2");
        Uwl.add("Aboba 3");
        Uwl.add("Aboba 4");

        System.out.println(Uwl);

        Uwl.remove("Aboba 2");
        Uwl.add("Aboba 2");
        Uwl.moveToBack("Aboba 3");

        System.out.println(Uwl);
    }
}
