package third;

public class Rectangle extends Shape {
    protected double m_width;
    protected double m_length;

    public Rectangle() {
        super("blue", false);
        this.m_width = 1;
        this.m_length = 1;
    }

    public Rectangle(double width, double length) {
        super("blue", false);
        this.m_width = width;
        this.m_length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super("blue", false);
        this.m_width = width;
        this.m_length = length;
    }

    public double getWidth() {
        return this.m_width;
    }

    public void setWidth(double width) {
        this.m_width = width;
    }

    public double getLength() {
        return this.m_length;
    }

    public void setLength(double length) {
        this.m_length = length;
    }

    @Override
    public double getArea() {
        return this.m_length * this.m_width;
    }

    @Override
    public double getPerimeter() {
        return (this.m_length + this.m_width) * 2;
    }

    @Override
    public String toString() {
        return "Shape: Rectangle\nColor: " + m_color + "\nmLength: " + this.m_length + "\nWidth: " + this.m_width;
    }

}
