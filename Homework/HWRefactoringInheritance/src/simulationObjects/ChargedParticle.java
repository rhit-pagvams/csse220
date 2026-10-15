package simulationObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class ChargedParticle extends Particle{

    private Random rand = new Random();
    private Color ringColor1;
    private Color ringColor2;

    public ChargedParticle( int x, int y) {
        super(x, y);
        randomizeColors();
    }

    private Color randomColor() {
        return new Color(rand.nextInt(256),
                rand.nextInt(256),
                rand.nextInt(256));
    }

    private void randomizeColors() {
        setColor(randomColor());
        ringColor1 = randomColor();
        ringColor2 = randomColor();
    }

    @Override
    public void drawOn(Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g.create();

        int x = getCenterX();
        int y = getCenterY();
        int radius = getRadius();

        g2.setColor(ringColor1);
        g2.drawOval(x - radius / 2, y - radius * 2,
                radius, radius * 4);

        g2.setColor(ringColor2);
        g2.drawOval(x - radius * 2, y - radius /2,
                radius * 4, radius);

        g2.dispose();

        super.drawOn(g);
    }

    @Override
    public void bounce(SimulationObject other) {
        super.bounce(other);

        randomizeColors();
    }
}


