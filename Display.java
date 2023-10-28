package OS.Display;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display {
	
	JFrame mainFrame = new JFrame();
	
	JPanel mainPanel = new JPanel();

	JPanel starPanel = new JPanel();
	
	Icon menuIcon = new ImageIcon("./Resources/Java .jpg");
	Icon powerIcon = new ImageIcon("./Resources/powerButton2.jpg");
	ImageIcon OSIcon = new ImageIcon("./Resources/JavaIcon.png");
	
	Icon mainIcon = new ImageIcon("./Recources/MainScreen.png");

	
	public Display() {
		
		//TaskBar
		JLabel taskbar = new JLabel();
		taskbar.setBounds(0, 760, 1475, 50);
		taskbar.setOpaque(true);
		taskbar.setBackground(new Color(50, 100, 250));
		
		//Labels
		
		//Buttons
		JButton starButton = new JButton(menuIcon);
		starButton.setBounds(0,675,50,45);
		starButton.setToolTipText("Start");
		starButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				mainFrame.setContentPane(starPanel);
			}
		});

		JButton starButton2 = new JButton(menuIcon);
		starButton2.setBounds(0,675,50,45);
		starButton2.setToolTipText("Start");
		starButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				mainFrame.setContentPane(mainPanel );
			}
		});

		JButton powerButton = new JButton(powerIcon);
		powerButton.setBounds(0,430,50,45);
		powerButton.setToolTipText("ShutDown");
		powerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				mainFrame.setCursor(Cursor.WAIT_CURSOR);
				try{
					Thread.sleep(10000);
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
				mainFrame.dispose();
				System.out.println("shutting down");
				System.exit(0);
			}
		});

		//MenuConfiguration

		starPanel.setLayout(null);
		starPanel.setBounds(0,200,350,520);
		starPanel.setBackground(new Color(125,50,250));
		
		//Add containers
		// mainPanel.add((Component) mainIcon);
		mainPanel.setBounds(0, 0, 1280, 675);
		mainPanel.setLayout(null);
		mainPanel.add(taskbar);
		mainPanel.add(starButton);

		starPanel.add(starButton2);
		starPanel.add(powerButton);
		
		//Main Screen
		mainFrame.setTitle("FMS");
		mainFrame.setUndecorated(true);
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setIconImage(OSIcon.getImage());
		
		mainFrame.setContentPane(mainPanel);
		
		mainFrame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Display();
	}
}