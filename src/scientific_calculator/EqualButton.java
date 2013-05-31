package scientific_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class EqualButton extends JButton implements MouseListener{
	ArithmeticUnit arithmeticUnit;
	EqualButton(String display, ArithmeticUnit arithmeticUnit) {
		super(display);
		this.arithmeticUnit =arithmeticUnit;
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("EqualButton!");
		arithmeticUnit.operate();
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}
