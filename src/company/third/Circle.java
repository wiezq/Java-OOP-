package third;

public class Circle extends Shape {
    protected double m_radius;

    public Circle() {
        this.m_color = "blue";
        this.m_filled = false;
        this.m_radius = 1;
    }

    public Circle(double radius) {
        this.m_color = "blue";
        this.m_filled = false;
        this.m_radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        m_radius = radius;
        m_color = color;
        m_filled = filled;
    }

    public double getRadius() {
        return this.m_radius;
    }

    public void setRadius(double radius) {
        this.m_radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(m_radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * m_radius;
    }

    public String toString() {
        return "Shape: Circle\nRadius: " + this.m_radius + "\nColor: " + this.m_color;
    }
}
