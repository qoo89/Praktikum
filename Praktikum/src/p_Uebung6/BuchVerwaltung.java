package p_Uebung6;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class BuchVerwaltung {

	
	
	public static void main(String[] args) 
	{
	
	
		
	StdOut.print("Wie viele Buecher moechten Sie einlesen? ");
	int anzahl = StdIn.readInt();
	
	Buch[] buchliste = new Buch[anzahl];
	
	
	for(int i=0; i<buchliste.length;i++)
	{
		StdOut.println("Buch(irgendeine Zahl) und EBook(-1)");
		int eingabe = StdIn.readInt();
		if (eingabe == -1)
		{
			buchliste[i] = EBook.erfasseEbook();
		}else
		{
			buchliste[i] = Buch.erfasseBuch();
		}
	
	}	
/*	
	//Ausgabe aller Buecher
	for(int i=0; i<buchliste.length;i++)
	{
		StdOut.println(buchliste[i]);
	}
*/	
	//Berechnung und Ausgabe Buecher
	StdOut.println("Durchschnittspreis: "+ Buch.berechneDurchschnittsPreis(buchliste)+" Euro");
	
/*
	loescheBuch(buecherArray); //Aufruf der Methode loescheBuch 
*/


	//Ausgabe alle Inhalte die ungleich NULL sind
	for(int i=0;i<buchliste.length;i++)
	{
		if (buchliste[i]!=null)
		{
			StdOut.println(buchliste[i].toString());
		}
	}

	
	
				
	}

	
/*
	public static void loescheBuch(Buch[] buecherArray) //Aufgabe 1d, l�scht 2 B�cher an stelle 2 & 3
	{
		//Elemente auf NULL setzen
		for(int i=0; i<buchliste.length;i++)
		{
			int x=1;
			int y=2;
			
			buecherArray[x]=null;
			buecherArray[y]=null;
		}
	}
*/
	
	
	

	

	
	
	
	
	

}
