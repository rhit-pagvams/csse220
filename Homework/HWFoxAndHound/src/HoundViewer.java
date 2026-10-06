import java.awt.Dimension;
import javax.swing.JFrame;

public class HoundViewer {
    public static final Dimension HOUND_VIEWER_SIZE = new Dimension(600, 800);

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(HOUND_VIEWER_SIZE);
        frame.setTitle("I see a hound and a fox!");

        frame.add(new HoundComponent());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
