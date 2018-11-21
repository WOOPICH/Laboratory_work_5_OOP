package woopich.GUI;

import java.awt.*;
import java.awt.geom.Point2D;

public interface Shape
{

    void getShape (Graphics2D g);

    Color getColor();

    Point2D getPoint_1();

    void setColor(Color color);

    void setPoint_1(Point2D point_1);
}
