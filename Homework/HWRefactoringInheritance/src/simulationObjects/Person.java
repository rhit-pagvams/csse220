package simulationObjects;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Dimension;

/**
 * This class represents a Person who can either be healthy (green), infected (orange), or recovered (pink).
 * Once a Person becomes infected, they will remain infected for a certain length of time before they
 * become recovered. Once recovered, the Person cannot be infected again.
 * 
 * Inspired by this article: https://www.washingtonpost.com/graphics/2020/world/corona-simulator/
 * 
 * To visualize a population of Persons over time you should provide a method that says if a Person 
 * isHealthy, isSick, or isRecovered.
 * 
 * 
 * This class should use inheritance to make it simple to write. You should not need to copy and paste
 * 
 * TODO: Part 4 You can change this file but will need to provide each of the methods started in order to get full 
 * functionality.
 * 
 * @author YOUR_NAME
 *
 */
public class Person extends SimulationObject {
	
	public static final int PERSON_RADIUS = 10;
	public static final int PERSON_SPEED = 5;
	
	//How many timesteps to recover once infected
	public static final int TIME_TO_RECOVER = 100;
	
	public static final Color HEALTHY_COLOR = new Color(134, 184, 184);
	public static final Color INFECTED_COLOR = new Color(204, 102, 0);
	public static final Color RECOVERED_COLOR = new Color(196, 116, 195);
	
	
	//DONE: add instance variables

	private int status;
	private int infectedTime;

	private static final int HEALTHY = 0;
	private static final int INFECTED = 1;
	private static final int RECOVERED = 2;

	//DONE: add constructors

	public Person(int x, int y) {
		this(x, y, false);
	}

	public Person(int x, int y, boolean infected) {
		super(x, y, PERSON_RADIUS, PERSON_SPEED, infected ? INFECTED_COLOR : HEALTHY_COLOR);

		if (infected) {
			status = INFECTED;
		} else {
			status = HEALTHY;
		}

		infectedTime = 0;
	}

	@Override
	public void drawOn(Graphics2D g) {
		//USE COLOR CONSTANTS to draw people with different statuses
		super.drawOn(g);
	}

	@Override
	public void update(Dimension dim) {
		//DONE Update your position
		super.update(dim);

		if (isInfected()) {
			infectedTime++;

			if (infectedTime >= TIME_TO_RECOVER) {
				status = RECOVERED;
				setColor(RECOVERED_COLOR);
			}
		}
	}
	
	public void bounce(Person other) {
		//DONE Infect healthy people when they bounce off of infected people
	super.bounce(other);

	boolean thisInfected = this.isInfected();
	boolean otherInfected = other.isInfected();

	if (thisInfected && other.isHealthy()) {
		other.status = INFECTED;
		other.infectedTime = 0;
		other.setColor(INFECTED_COLOR);
	}

	if (otherInfected && this.isHealthy()) {
		this.status = INFECTED;
		this.infectedTime = 0;
		this.setColor(INFECTED_COLOR);
		}
	}

	@Override
	public void bounce(SimulationObject other) {
		if (other instanceof Person) {
			bounce((Person) other);
		} else {
			super.bounce(other);
		}
	}

	public boolean isHealthy() {
		// DONE return true if this person is healthy.  False if infected or recovered
		return status == HEALTHY;
	}

	public boolean isInfected() {
		// DONE return true if this person is sick.  False if infected or recovered
		return status == INFECTED;
	}
	
	public boolean isRecovered() {
		// DONE return true if this person is recovered.  False if infected or healthy
		return status == RECOVERED;
	}

	public boolean overlapsWith(Person other) {
		// DONE return true if the person is within range of another
		return super.overlapsWith(other);
	}


}
