package labs.third;

public class CircleDish extends Dish{
    private double m_radius;
    private double m_height;

    public CircleDish()
    {
        super(300, "Blue");
        this.m_radius = 5;
        this.m_height = 5;
    }

    public CircleDish(double radius)
    {
        super(300, "Blue");
        this.m_radius = radius;
        this.m_height = 5;
    }

    public CircleDish(double radius, double height)
    {
        super(300, "Blue");
        this.m_radius = radius;
        this.m_height = height;
    }

    public CircleDish(double radius, double height, int price, String color)
    {
        super(price, color);
        this.m_radius = radius;
        this.m_height = height;
    }

    public double getM_height() {
        return m_height;
    }

    public void setM_height(double m_height) {
        this.m_height = m_height;
    }

    public double getM_radius() {
        return m_radius;
    }

    public void setM_radius(double m_radius) {
        this.m_radius = m_radius;
    }

    @Override
    protected double getSize() {
        return (1.33*Math.PI*m_radius*m_radius*m_radius) - 1;
    }

    @Override
    public String toString() {
        return "CircleDish{" +
                "m_radius=" + m_radius +
                ", m_height=" + m_height +
                "} " + super.toString();
    }
}
