package third;

public abstract class Shape {
    protected String m_color;
    protected boolean m_filled;

    public Shape() {
        this.m_color = "blue";
        this.m_filled = false;
    }

    public Shape(String color, boolean filled) {
        this.m_color = color;
        this.m_filled = filled;
    }

    public String getColor() {
        return this.m_color;
    }

    public void setColor(String color) {
        this.m_color = color;
    }

    public boolean isFilled() {
        return this.m_filled;
    }

    public void setFilled(boolean filled) {
        this.m_filled = filled;
    }

    abstract protected double getArea();

    abstract protected double getPerimeter();

    @Override
    public String toString() {
        return "Color is " + this.m_color + "\n" + "Filled: " + this.m_filled;
    }
}
