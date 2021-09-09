package third;

public class Square extends Rectangle {
    public Square() {
        super(1,1,"blue", false);
        // this.m_length = 1;
        // this.m_width = 1;
        // this.m_color = "blue";
        // this.m_filled = false;
    }

    public Square(double side) {
        super(side,side,"blue", false);
        // this.m_length = side;
        // this.m_width = side;
        // this.m_color = "blue";
        // this.m_filled = false;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        // this.m_length = side;
        // this.m_width = side;
        // this.m_color = color;
        // this.m_filled = filled;
    }

    public double getSide() {
        return this.m_length;
    }

    public void setSide(double side) {
        this.m_length = side;
        this.m_width = side;
    }
    @Override
    public void setWidth(double side) {
        this.m_width = side;
    }
    @Override
    public void setLength(double side) {
        this.m_length = side;
    }
    @Override
    public String toString()
    {
        return "Shape: Square\nColor: " + m_color + "\nSide: " + m_width;
    }
}
