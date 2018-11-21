package woopich.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

public class MyComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g)
    {
       // Font font = new Font("Arial", Font.ITALIC, 20);
        Graphics2D g2 = (Graphics2D)g;
        Random random = new Random();
       // g2.setFont(font);
        Shape[] shapes = new Shape[10];
        Color colors[] = {Color.red, Color.magenta, Color.blue, Color.cyan, Color.green, Color.black};
        for (int i = 0; i < shapes.length; i++) {

            int pos = random.nextInt(colors.length);
            boolean it = random.nextBoolean();
            if (it) {                              //Rectangle

                double tX = random.nextInt(50 * (i + 1)) + 1, tY = random.nextInt(50 * (i + 1)) + 1;
                double tX1 = random.nextInt(50 * (i + 1) + 10 * i), tY1 = random.nextInt(50 * (i + 1) + 10 * i);
                Point2D point_1 = new Point2D.Double(tX,tY);
                Point2D point_2 = new Point2D.Double(tX1,tY1);
                shapes[i] = new Rectangle(colors[pos],point_1,point_2);
            }
            else {                                      //Circle

                double tX = random.nextInt(100 * (i + 1)) + 1, tY = random.nextInt(50 * (i + 1)) + 1;
                double height = random.nextInt(100) + 50, width = random.nextInt(100) + 20;
                Point2D point = new Point2D.Double(tX,tY);
                shapes[i] = new Circle(colors[pos], point, height, width);
            }
        }
        for (Shape shape : shapes) {
            shape.getShape(g2);
        }
    }
}
