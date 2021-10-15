package twenty;

public class TestDish {



    public static void main(String[] args) {
        CircleDish cd = new CircleDish(10, 5, 3000, "Фиолетовый");

        SquareDish sd = new SquareDish(4, 5, 4000, "Голубой");


        System.out.println("Размер круглой тарелки " + cd.getSize());
        System.out.println("Размер квадратной тарелки " + sd.getSize());

        System.out.println(sd);
        System.out.println(cd);
    }
}
