package OS.Display;

import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display {
	
	JFrame mainFrame = new JFrame();
	
	JPanel mainPanel = new JPanel();
	
	ImageIcon OSIcon = new ImageIcon("./Resources/JavaIcon.png");
	
	Icon mainIcon = new ImageIcon("./Recources/MainScreen.png");
	
	public Display() {
		
		//TaskBar
		JLabel taskbar = new JLabel();
		taskbar.setBounds(0, 675, 1100, 45);
		taskbar.setOpaque(true);
		taskbar.setBackground(new Color(950, 100, 250));
		
		//Labels
		
		//Buttons
		
		//Add containers
		mainPanel.add((Component) mainIcon);
		mainPanel.setBounds(0, 0, 1280, 675);
		mainPanel.setLayout(null);
		mainPanel.add(taskbar);
		
		//Main Screen
		mainFrame.setTitle("FMS");
		mainFrame.setUndecorated(true);
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setIconImage(OSIcon.getImage());
		
		mainFrame.setContentPane(mainFrame);
		
		mainFrame.setVisible(true);
		
	}
	
}