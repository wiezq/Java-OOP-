package first;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Абв", 100, "Баскетбольный");
        Ball b2 = new Ball("hf", 6503, "Футбольный");
        Ball b3 = new Ball("uk7ku", 300, "Волейбольный");

        b2.setPrice(400);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
