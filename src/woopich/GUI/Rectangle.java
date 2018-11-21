package woopich.GUI;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle implements Shape
{
    private Color color;
    private Point2D point_1;
    private Point2D point_2;

    Rectangle(Color color, Point2D point_1, Point2D point_2)
    {
        this.color = color;
        this.point_1 = point_1;
        this.point_2 = point_2;
    }

    @Override
    public void getShape (Graphics2D g)
    {
        Rectangle2D rectangle2D = new Rectangle2D.Double(this.point_1.getX(),this.point_1.getY(),this.point_2.getX(),this.point_2.getY());
        g.setPaint(this.color);
        g.fill(rectangle2D);
        g.draw(rectangle2D);
    }

    @Override
    public Color getColor()
    {
        return color;
    }

    @Override
    public Point2D getPoint_1()
    {
        return point_1;
    }

    public Point2D getPoint_2()
    {
        return point_2;
    }

    @Override
    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public void setPoint_1(Point2D point_1)
    {
        this.point_1 = point_1;
    }

    public void setPoint_2(Point2D point_2)
    {
        this.point_2 = point_2;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "color=" + color +
                ", point_1=" + point_1 +
                ", point_2=" + point_2 +
                '}';
    }
}
