package OS.Main;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Boot extends  JFrame  {
	
	private static final long serialVersionUID = 1L;
	ImageIcon icon = new ImageIcon("./Resources/JavaIcon.png");
	Icon imgIcon = new ImageIcon("./Resources/LoadingBoot.gif");
	Icon imgIcon2 = new ImageIcon("./Resources/JavaLoad.jpg");

	public Boot() {
		
		JLabel label = new JLabel(imgIcon);
		label.setBounds(580, 500, 100, 100);
		
		JLabel label2 = new JLabel(imgIcon2);
		label2.setBounds(490, 50, 300, 400);
		
		getContentPane().add(label);
		getContentPane().add(label2);
		
		setTitle("FMS");
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(0,0,0));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(icon.getImage());
		
	}
	
}