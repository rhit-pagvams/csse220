package liveCoding;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MyComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        drawSimpleSquare(g2);
        drawEllipse(g2);
        drawLineWithCoordinates(g2);
        drawLineWithPoints(g2);
    }

    private void drawSimpleSquare(Graphics2D g2) {
        g2.drawRect(50, 50, 100, 100);
    }

    private void drawEllipse(Graphics2D g2) {
        Ellipse2D.Double ellipse =
                new Ellipse2D.Double(200, 50, 150, 100);

        g2.draw(ellipse);
    }

    private void drawLineWithCoordinates(Graphics2D g2) {
        Line2D.Double line =
                new Line2D.Double(100, 250, 300, 250);

        g2.draw(line);
    }

    private void drawLineWithPoints(Graphics2D g2) {
        Point2D.Double p1 = new Point2D.Double(100, 300);
        Point2D.Double p2 = new Point2D.Double(300, 400);

        Line2D.Double line =
                new Line2D.Double(p1, p2);

        g2.draw(line);
    }
}