package labs.fifth;

import third.Rectangle;

public class Square extends Rectangle {
    public Square() {
        super(1, 1, "blue", false);
    }

    public Square(double side) {
        super(side, side, "blue", false);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
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
    public String toString() {
        return "Shape: Square\nColor: " + m_color + "\nSide: " + m_width;
    }
}
