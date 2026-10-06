import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

/**
 * Class representing a hound dog.
 */

public class Hound {

    private static final int HEIGHT = 160;
    private static final int WIDTH = 110;

    private static final Color EAR_COLOR = Color.BLACK;

    private int x;
    private int y;
    private Color color;

    public Hound(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawOn(Graphics2D g2) {
        g2.translate(x, y);

        // Face
        Rectangle face = new Rectangle (0, 0, WIDTH, HEIGHT);
        g2.setColor(color);
        g2.fill(face);

        // Left ear
        int[] leftX = {0, 0, -50};
        int[] leftY = {0, HEIGHT + 20, HEIGHT - 30};

        Polygon leftEar = new Polygon(leftX, leftY, 3);

        // Right Ear
        int[] rightX = {WIDTH, WIDTH, WIDTH + 50};
        int[] rightY = {0, HEIGHT + 20, HEIGHT - 30};

        Polygon rightEar = new Polygon(rightX, rightY, 3);

        g2.setColor(EAR_COLOR);
        g2.fill(leftEar);
        g2.fill(rightEar);

        g2.translate(-x, -y);
    }

}
