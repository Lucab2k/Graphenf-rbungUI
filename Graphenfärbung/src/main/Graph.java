package main;

import java.util.ArrayList;

public class Graph {
	
	int AnzahlKnoten;
	Object[][] Array;
	Färbungsmöglichkeit Färbungsmöglichkeit;
	
	
	 public Graph(int AnzahlKnoten) {
		this.AnzahlKnoten = AnzahlKnoten;
		Array = new Object[AnzahlKnoten][AnzahlKnoten];
	 }


	public Object[][] getGraphArray() {
		return Array;
	}
	 
	 
	 

}
