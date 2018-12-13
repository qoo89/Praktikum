package p_Uebung4;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdOut.println("Wie viele Zeilen und Spalten benoetigen Sie? ");
		int laenge = StdIn.readInt();
		//StdOut.println("Wie viele Spalten benoetigen Sie? ");
		//int spalten = StdIn.readInt();
		
		int[][] array = new int [laenge][laenge];
		int x=1;
		
		//zählt an Stelle [0][0] x=1; Stelle[1][1] x=2
		for(int i=0; i<array.length; i++)
		{
			
			array[i][i]=x;
			x++;
		}
		//Verschachtelte Schleife Innere Schleife=Zeilendurchlauf
		//äußere spalten durchlauf
		for(int i=0; i<array.length; i++)
		{
			StdOut.print(array[0][i]);
			
			for(int n=1; n<array.length; n++)
			{
				StdOut.print(array[n][i]);
								
			}
			StdOut.println();
			
			
		}
		
		
		
		
	}

}
