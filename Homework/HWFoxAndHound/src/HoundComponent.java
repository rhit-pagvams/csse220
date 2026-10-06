import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class HoundComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        Graphics2D graphics2 = (Graphics2D) graphics;

        // Light blue background
        graphics2.setColor(new Color(173, 216, 230));
        graphics2.fillRect(0, 0, getWidth(), getHeight());

        // Brown hound
        Hound hound = new Hound(150, 150, new Color(124, 71, 0));
        hound.drawOn(graphics2);

        // Orange fox
        Fox fox = new Fox(300, 400, Color.ORANGE);
        fox.drawOn(graphics2);
    }
}
