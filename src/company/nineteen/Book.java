package nineteen;

public class Book {
    private String m_name;
    private String m_author;
    private int m_price;

    public Book(String name, int price, String author) {
        m_name = name;
        m_price = price;
        m_author = author;
    }

    public Book(String name, String author) {
        m_name = name;
        m_price = 0;
        m_author = author;
    }


    public void setName(String name) {
        m_name = name;
    }

    public String getName() {
        return this.m_name;
    }

    public void setPrice(int price) {
        m_price = price;
    }

    public int getPrice() {
        return m_price;
    }

    public void setType(String author) {
        m_author = author;
    }

    public String getType() {
        return m_author;
    }

    public String toString() {
        return "Название книги: " + m_name + "\nАвтор: " + m_author + "\nЦена: " + m_price;
    }
}
