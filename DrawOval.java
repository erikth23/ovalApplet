package applets;

import java.awt.*;
import javax.swing.*;
public class DrawOval extends JPanel{
	private int l=10;
	private int w=10;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillOval(10, 10, w, l);
	}
	
	public void setW(int newD){
		w=(newD>=0?newD:10);
		repaint();
	}
	
	public void setL(int newD){
		l=(newD>=0?newD:10);
		repaint();
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(200, 200);
	}
	
	public Dimension getMinumumSize(){
		return getPreferredSize();
	}
}
