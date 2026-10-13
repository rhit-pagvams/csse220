package clicksProblem;

import rectangleExample.DrawComponent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickListener implements MouseListener{

    private DrawComponent component;
    private int x1;
    private int y1;

    @Override
    public void mouseClicked(MouseEvent e) {
        component.addCircle(e.getX(), e.getY());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
