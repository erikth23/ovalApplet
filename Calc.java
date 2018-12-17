package applets;

import java.awt.*;
import javax.swing.*;
public class Calc extends JApplet{
	
	private double sum;
	
	public void init(){
		String fn = JOptionPane.showInputDialog("Enter the first number:");
		String sn = JOptionPane.showInputDialog("Enter the second number:");
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		sum = n1+n2;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString(""+sum, 35, 30);
	}

}
