package simulationObjects;
import java.awt.Color;

/**
 * The Particle class consists of a black circle which moves and
 * bounces off the boundaries of the spaces it is inside as well
 * as other particles.
 * 
 * @author YOUR_NAME
 * 
 * DONE: Part 2 You can change and should change anything you wish to in this file
 *
 */
public class Particle extends SimulationObject{
	public static final int PARTICLE_RADIUS = 10;
	public static final int PARTICLE_SPEED = 5;
	public static final Color PARTICLE_COLOR = Color.BLACK;

	public Particle(int x, int y) {
		super(x, y, PARTICLE_RADIUS, PARTICLE_SPEED, PARTICLE_COLOR);
	}
}