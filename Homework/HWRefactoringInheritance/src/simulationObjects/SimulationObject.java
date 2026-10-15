package simulationObjects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

public abstract class SimulationObject {
    private int centerX, centerY, radius, ve1X, ve1Y, moveSpeed;
    private Color color;

    public SimulationObject(int x, int y, int radius, int speed, Color color) {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
        this.moveSpeed = speed;
        this.color = color;

        this.ve1X = (int) (speed - Math.random() * speed * 2);
        this.ve1Y = (int) (speed - Math.random() * speed * 2);

        normalizeVelocity();

    }

    public void drawOn(Graphics2D g) {
        g = (Graphics2D) g.create();
        g.setColor(this.color);
        g.translate(centerX - radius, centerY - radius);
        g.fillOval(0, 0, radius * 2, radius * 2);
        g.dispose();

    }

    public void update(Dimension dim) {
        centerX += ve1X;
        centerY += ve1Y;

        if (centerX > dim.getWidth() || centerX < 0) {
            centerX = (int)Math.min(Math.max(centerX, 0), dim.getWidth());
            ve1X = -ve1X;
        }
        if (centerY > dim.getHeight() || centerY < 0) {
            ve1Y = -ve1Y;
            centerY = (int)Math.min(Math.max(centerY, 0), dim.getHeight());
        }
    }

    public boolean overlapsWith(SimulationObject other) {
        int xDiff = centerX - other.centerX;
        int yDiff = centerY - other.centerY;

        double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff);

        return this.radius + other.radius >= distance;
    }

    public void bounce(SimulationObject other) {
        ve1X = this.centerX - other.centerX;
        ve1Y = this.centerY - other.centerY;

        normalizeVelocity();
    }

    public void normalizeVelocity() {
        if (this.ve1X == 0 && this.ve1Y == 0) {
            this.ve1X = 1;
            this.ve1Y = 1;
        }
        double vectorLength = Math.sqrt(ve1X * ve1X + ve1Y * ve1Y);

        this.ve1X = (int)(this.ve1X / vectorLength * moveSpeed * 2);
        this.ve1Y = (int)(this.ve1Y / vectorLength * moveSpeed * 2);
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}


