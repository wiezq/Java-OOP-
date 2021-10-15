package twentytwo;
import javax.swing.*;
import java.awt.*;

public class TaskOne extends JFrame {

    public static Shape getRandomShape() {
        int rand = (int)(Math.random() * 3);
        if (rand == 0)
            return new Rectangle();
        else if (rand == 1)
            return new Circle();
        else
            return new Square();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0, x = 15; i < 5; ++i, x += 280)
            for (int j = 0, y = 35; j < 4; ++j, y += 175) {
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);

                Shape sh = getRandomShape();
                sh.setX(x);
                sh.setY(y);
                sh.setColor(new Color(red, green, blue));

                g.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Square"))
                    g.fillRect(sh.getX(), sh.getY(), 150, 150);
                else if (sh.getClass().getSimpleName().equals("Rectangle"))
                    g.fillRect(sh.getX(), sh.getY(), 200, 150);
                else if (sh.getClass().getSimpleName().equals("Circle"))
                    g.fillOval(sh.getX(), sh.getY(), 150, 150);
            }
    }

    private static void createAndShowGUI() {
        TaskOne tw = new TaskOne();
    }

    public TaskOne() {
        super("Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI(); }
        });
    }
}
