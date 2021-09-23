package labs.second;


public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("451 градус по фаренгейту", 231, "Рей Бредбери");
        Book b2 = new Book("Скотный двор", "Джордж Оурэлл");

        System.out.println(b1.getName());

        System.out.println(b1);
        System.out.println(b2);
    }
}
