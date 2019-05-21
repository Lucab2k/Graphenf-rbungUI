package main;

import java.text.ParseException;

public class main {

	public static landingWindow frame;
	
	public static void main(String[] args) {
		frame = null;
		try {
			frame = new landingWindow();
			frame.setVisible(true);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
