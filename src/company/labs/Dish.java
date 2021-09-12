package labs;

abstract class Dish {
    protected int m_price;
    protected String m_color;

    public Dish() {
        this.m_price = 100;
        this.m_color = "White";
    }

    public Dish(int price) {
        this.m_price = price;
        this.m_color = "White";
    }

    public Dish(int price, String color) {
        this.m_price = price;
        this.m_color = color;
    }

    public int getPrice() {
        return m_price;
    }

    public void setPrice(int m_price) {
        this.m_price = m_price;
    }

    public String getColor() {
        return m_color;
    }

    public void setColor(String m_color) {
        this.m_color = m_color;
    }

    abstract protected double getSize();

    @Override
    public String toString() {
        return "Dish{" +
                "m_price=" + m_price +
                ", m_color='" + m_color + '\'' +
                '}';
    }
}