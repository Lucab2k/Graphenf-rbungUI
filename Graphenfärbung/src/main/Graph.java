package main;

import java.util.ArrayList;

public class Graph {
	
	int AnzahlKnoten;
	Object[][] Array;
	F�rbungsm�glichkeit F�rbungsm�glichkeit;
	
	
	 public Graph(int AnzahlKnoten) {
		this.AnzahlKnoten = AnzahlKnoten;
		Array = new Object[AnzahlKnoten][AnzahlKnoten];
	 }


	public Object[][] getGraphArray() {
		return Array;
	}
	 
	 
	 

}
