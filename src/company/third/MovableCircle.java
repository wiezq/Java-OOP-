package third;

public class MovableCircle  implements Movable {

    private int m_radius;
    private MovablePoint m_center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius)
    {
        this.m_radius = radius;
        m_center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    public void moveUp()
    {
        m_center.moveUp();
    }
    public void moveDown()
    {
        m_center.moveDown();
    }
    public void moveLeft()
    {
        m_center.moveLeft();
    }
    public void moveRight()
    {
        m_center.moveRight();
    }
}
