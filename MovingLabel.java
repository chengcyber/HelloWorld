
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MovingLabel extends JComponent
			implements MouseListener {

	public MovingLabel(String labelText,
						int startX, int startY) {
		text = labelText;
		x = startX;
		y = startY;
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		g.drawString(text, x, y);
	}
	
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	private int x;
	private int y;
	private String text;
	
}
