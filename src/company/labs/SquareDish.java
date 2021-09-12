package labs;

public class SquareDish extends Dish {
    private double m_side;
    private double m_height;

    public SquareDish() {
        super(500, "Red");
        this.m_side = 5;
        this.m_height = 5;
    }

    public SquareDish(double side, double height) {
        super(500, "Red");
        this.m_side = side;
        this.m_height = height;
    }

    public SquareDish(double side, double height, int price, String color) {
        super(price, color);
        this.m_side = side;
        this.m_height = height;
    }

    public double getM_height() {
        return m_height;
    }

    public void setM_height(double m_height) {
        this.m_height = m_height;
    }

    public double getM_side() {
        return m_side;
    }

    public void setM_side(double m_side) {
        this.m_side = m_side;
    }

    @Override
    protected double getSize() {
        return m_side * m_side * m_height;
    }

    @Override
    public String toString() {
        return "SquareDish{" +
                "m_side=" + m_side +
                ", m_height=" + m_height +
                "} " + super.toString();
    }
}
