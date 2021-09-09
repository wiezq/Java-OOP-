package third;

public class MovableRectangle implements Movable {

    private MovablePoint m_topLeft;
    private MovablePoint m_botRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        m_topLeft = new MovablePoint(x1, y1, xSpeed,ySpeed);
        m_botRight = new MovablePoint(x2, y2, xSpeed,ySpeed);
    }

    // Метод проверяющий скорость на оси Y, в двух точках

    public boolean isYSpeedEqual()
    {
        return this.m_botRight.m_ySpeed == this.m_topLeft.m_ySpeed;
    }

    // Метод проверяющий скорость на оси X, в двух точках
    public boolean isXSpeedEqual()
    {
        return this.m_botRight.m_xSpeed == this.m_topLeft.m_xSpeed;
    }
    @Override
    public void moveUp()
    {
        if(isYSpeedEqual()) // Проверка на соответсвие скорости
        {
            this.m_topLeft.m_y += this.m_topLeft.m_ySpeed; // Перемещение прямоугольника вверх
            this.m_botRight.m_y += this.m_botRight.m_ySpeed;
        }
    }
    @Override
    public void moveDown()
    {
        if(isYSpeedEqual()) // Проверка на соответсвие скорости
        {
            this.m_topLeft.m_y -= this.m_topLeft.m_ySpeed; // Перемещение прямоугольника вниз
            this.m_botRight.m_y -= this.m_botRight.m_ySpeed;
        }
    }
    @Override
    public void moveLeft()
    {
        if(isXSpeedEqual()) // Проверка на соответсвие скорости
        {
            this.m_topLeft.m_x -= this.m_topLeft.m_xSpeed; // Перемещение прямоугольника влево
            this.m_botRight.m_x -= this.m_botRight.m_xSpeed;
        }
    }
    @Override
    public void moveRight()
    {
        if(isXSpeedEqual()) // Проверка на соответсвие скорости
        {
            this.m_topLeft.m_x += this.m_topLeft.m_xSpeed; // Перемещение прямоугольника вправо
            this.m_botRight.m_x += this.m_botRight.m_xSpeed;
        }
    }
}
