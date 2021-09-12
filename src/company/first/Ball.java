package first;

public class Ball {
    private String m_name;
    private int m_price;
    private String m_type;

    public Ball(String name, int price, String type) {
        m_name = name;
        m_price = price;
        m_type = type;
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

    public void setType(String type) {
        m_type = type;
    }

    public String getType() {
        return m_type;
    }

    public String toString() {
        return "Мяч фирмы: " + m_name + "\nТип мяча: " + m_type + "\nЦена: " + m_price;
    }
}
