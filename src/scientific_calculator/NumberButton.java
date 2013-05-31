package scientific_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class NumberButton extends JButton implements MouseListener {
	
	private String value;
	private DisplayArea displayArea;
	
	NumberButton(String value, DisplayArea displayArea) {
		setText(value);
		this.value = value;
		this.displayArea = displayArea;
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		displayArea.addDisplayContent(value);
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}
