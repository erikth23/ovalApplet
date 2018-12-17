package applets;

import java.awt.*;
import javax.swing.*;
public class First extends JApplet{
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("hey", 25, 25);
	}
}
