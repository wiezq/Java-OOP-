package third;

public class MovablePoint implements Movable{
    int m_x;
    int m_y;
    int m_xSpeed;
    int m_ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.m_x = x;
        this.m_y = y;
        this.m_xSpeed = xSpeed;
        this.m_ySpeed = ySpeed;
    }

    @Override
    public String toString()
    {
        return "Movable point\nx: " + this.m_x + " xSpeed: " + this.m_xSpeed + "\ny: " + this.m_y + " ySpeed: " + this.m_ySpeed;
    }

    @Override
    public void moveUp()
    {
        this.m_y += this.m_ySpeed;
    }
    @Override
    public void moveDown()
    {
        this.m_y -= this.m_ySpeed;
    }
    @Override
    public void moveLeft()
    {
        this.m_x -= this.m_xSpeed;
    }
    @Override
    public void moveRight()
    {
        this.m_x += this.m_xSpeed;
    }
}
