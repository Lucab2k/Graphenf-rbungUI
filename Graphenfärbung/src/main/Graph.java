package main;

import java.util.ArrayList;

public class Graph {
	
	int AnzahlKnoten;
	Boolean[][] Array;
	F�rbungsm�glichkeit F�rbungsm�glichkeit;
	
	
	 public Graph(int AnzahlKnoten) {
		this.AnzahlKnoten = AnzahlKnoten;
		Array = new Boolean[AnzahlKnoten][AnzahlKnoten];
	 }


	public Boolean[][] getGraphArray() {
		return Array;
	}
	 
	 
	 

}
