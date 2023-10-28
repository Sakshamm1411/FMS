package OS.Main;

import OS.Display.Display;

public class Main {
	
	private static boolean canProceed = false;

	public static void main(String[] args) throws InterruptedException {
		
		Boot boot = new Boot();
		boot.setVisible(true);
		
		Thread.sleep(10000);
		boot.dispose();
		canProceed = true;
		
		if(canProceed) {
			new Display();
		}
		
	}
	
}