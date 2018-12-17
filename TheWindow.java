package applets;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame{
	
	private JSlider slider;
	private JSlider slider2;
	private DrawOval myPanel;
	
	public TheWindow(){
		super("Title");
		
		myPanel = new DrawOval();
		myPanel.setBackground(Color.orange);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setW(slider.getValue());
					}
				}
		);
		
		slider2 = new JSlider(SwingConstants.VERTICAL, 0, 200, 190);
		slider2.setMajorTickSpacing(10);
		slider2.setPaintTicks(true);
		
		slider2.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setL(200-slider2.getValue());
					}
				}
		);
		
		add(slider, BorderLayout.SOUTH);
		add(slider2, BorderLayout.WEST);
		add(myPanel, BorderLayout.CENTER);
	}
}
