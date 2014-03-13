package pa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Main extends JApplet implements MouseListener, MouseMotionListener {
	
	int status;
	
	int scrSize = 700;
	
	int x;
	int y;
	
	@Override
	public void init() {
		x = 0;
		y = 0;
		setSize(scrSize, scrSize);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		JPanel p = new JPanel();
		add(p);
		
		JButton pen = new JButton("Pen");
		JButton eraser = new JButton("Eraser");
//		pen.setSize(50, 100);
//		eraser.setSize(50, 100);
		
		add(pen);
		add(eraser);
		
		status = 0;
	}
	
	@Override
	public void paint(Graphics g) {
		if(status == 1) {
			g.setColor(Color.black);
			g.fillOval(x, y, 10, 10);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		x = (int) p.getX();
		y = (int) p.getY();
		status = 1;
		
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
