package woopich.GUI;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Circle implements Shape {
    private Color color;
    private Point2D point;
    private double height;
    private double width;

    Circle(Color color, Point2D point_1, double height, double width)
    {
        this.color = color;
        this.point = point_1;
        this.height = height;
        this.width = width;
    }

    @Override
    public void getShape (Graphics2D g)
    {
        Ellipse2D ellipse2D = new Ellipse2D.Double(point.getX(), point.getY(), height, width);
        g.setPaint(this.color);
        g.fill(ellipse2D);
        g.draw(ellipse2D);
    }

    @Override
    public Color getColor()
    {
        return color;
    }

    @Override
    public Point2D getPoint_1()
    {
        return point;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    @Override
    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public void setPoint_1(Point2D point_1)
    {
        this.point = point_1;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "color=" + color +
                ", point=" + point +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
