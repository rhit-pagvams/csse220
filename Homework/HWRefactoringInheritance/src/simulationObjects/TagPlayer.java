package simulationObjects;
import java.awt.Color;
import java.awt.Dimension;

/**
 * The TagPlayer class represents a person playing the classic game of
 * "tag." https://en.wikipedia.org/wiki/Tag_(game)
 * 
 * A Person can either be "it" or not. When a person is "it" then they
 * appear with the color RED. A person moves around within an area and
 * bounces off of the boundaries and also off of other TagPlayers.
 * 
 * When a TagPlayer bounces into another then if one person is "it"
 * and the other is not, then they switch roles. The person who was 
 * not "it" becomes "it" and vice versa. 
 * 
 * One more rule is that a player who most recently "it" cannot become
 * it again for 10 timesteps. This is to prevent "tagbacks" where a player
 * immediately tags back the person who just tagged them.
 * 
 * @author YOUR_NAME
 * 
 * DONE: Part 2 You can change and should change anything you wish to in this file
 *
 */
public class TagPlayer extends SimulationObject{
	
	public static final int TAG_PLAYER_RADIUS = 20;
	public static final int TAG_PLAYER_SPEED = 4;
	public static final Color REGULAR_COLOR = new Color(100, 100, 100);
	public static final Color IT_COLOR = Color.RED;
	public static final int COUNTDOWN_RESET = 10;

	private boolean isCurrentlyIt;
	private int tagBackCountDown = 0;



	public TagPlayer(int x, int y, boolean isIt) {
		super(x, y, TAG_PLAYER_RADIUS, TAG_PLAYER_SPEED, isIt ? IT_COLOR : REGULAR_COLOR);

		this.isCurrentlyIt = isIt;
	}

	@Override
	public void update(Dimension dim) {
		super.update(dim);

		if (isCurrentlyIt) {
			setColor(IT_COLOR);
		} else {
			setColor(REGULAR_COLOR);
		}

		tagBackCountDown--;
	}

	@Override
	public void bounce(SimulationObject other) {
		super.bounce(other);

		if(other instanceof TagPlayer) {
			checkIfTagged((TagPlayer) other);
		}
	}


	public void checkIfTagged(TagPlayer other) {
			
		if (!this.isCurrentlyIt &&                // I must NOT be it, AND
					other.isCurrentlyIt  &&       // the other player MUST be it, AND
					this.tagBackCountDown <= 0) { // I must not have recently been "it"
				
			//I become "it"
			this.isCurrentlyIt = true;
			//The other player is NOT "it"
			other.isCurrentlyIt = false;   
			//The other player cannot be tagged back (become "it" again) for 10 timesteps
			other.tagBackCountDown = COUNTDOWN_RESET;
			this.setColor(IT_COLOR);
			other.setColor(REGULAR_COLOR);
		}
	}


}
