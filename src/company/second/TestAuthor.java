package second;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Alesha Popovich", "AleshaP@mail.ru", 'm');
        Author a2 = new Author("Leatherman Leathermenovich", "threHundredBuks@mail.ru", 'f');

        System.out.println(a1.getEmail());
        a1.setEmail("blabla@mail.ru");
        System.out.println(a1.getEmail());

        System.out.println(a1);
        System.out.print(a2);

    }
}
