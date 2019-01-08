package p_Uebung2;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
//Aufgabe 1
	
				StdOut.println("Anzahl Sternchen?");
				StdOut.println("Eingabe: ");
				int eingabe = StdIn.readInt();
				
				for(int i=1;i<=eingabe;i++)
				{
				StdOut.print("*");
				}

*/		
//Aufgabe 1b
/*
		StdOut.println("Anzahl Sternchen?");
		StdOut.println("Eingabe: ");
		int eingabe = StdIn.readInt();
		
		for(int i=1; i<=eingabe; i++)	//Zeilen
		{
		
			for(int i2=1; i2<eingabe; i2++)//Spalte
			{
				StdOut.print("*");
			
			}
		StdOut.println("*");
		
		}
*/
//Aufgabe 1c

		StdOut.println("Anzahl?");
		StdOut.println("Eingabe: ");
		int zeilen = StdIn.readInt();     //Anzahl Zeilen
		int h=zeilen;					  //Hilfvariable
		
		for(int count=0; count<zeilen; count++)	//anzahl Zeilen
		{
		
			h--;								//Hilfevariable um einen Verringern
			for(int i = h; i < zeilen ; i++) 	//Quasi Entlosschleife da sich i und h immer weiter voneinander entfernen
			{
				StdOut.print("*");
			}
			
			StdOut.println("");					//Zeilenumbruch
			
		}

//Aufagbe 1d - Kästenchen mitte Frei
/*
		StdOut.println("Anzahl Sternchen?");
		StdOut.println("Eingabe: ");
		int eingabe = StdIn.readInt();
		
		for(int i=1; i<=eingabe; i++)
		{
		
			if(i==1 || i==eingabe)					//
			{
				for(int i2 = 1; i2<eingabe; i2++) 
				{
					StdOut.print("*");
				}
			}
			
			else									//Hier werden die Leerzeichen im inneren des Kastens eingefügt
			{
				StdOut.print("*");
				for(int i2=2; i2<eingabe; i2++)
				{
					StdOut.print(" ");
				
				}
			
			}
			
		
		StdOut.println("#");
		
		}
*/

//Aufgabe 1e - Pyramide
/*	
		int hoehe=5;
		
		//jede Zeile einmal durchlaufen
		for(int i=0; i<hoehe; i++)
		{
						
			//Ausgabe Leerzeichen
			for(int j=0; j<hoehe-1-i; j++)
			{
				StdOut.print(" ");
			}
			//
			for(int k=0; k<i*2+1; k++)
			{
				//Sterne Ausgabe
				StdOut.print("*");
			}
			
			//Zeilenumbruch nach jeder Zeile
			StdOut.println();
		}
*/
		
		
		
		
		
		
		

	}

}
