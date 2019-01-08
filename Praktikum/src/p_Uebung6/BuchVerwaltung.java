package p_Uebung6;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class BuchVerwaltung {

	
	
	public static void main(String[] args) 
	{
			
	StdOut.print("Wie viele Buecher moechten Sie einlesen? ");
	int anzahl = StdIn.readInt();
	
	Buch[] buchliste = new Buch[anzahl]; 		//erstellt ein Array mit der Größe der eingegebenen Zahl
	
	
	for(int i=0; i<buchliste.length;i++)
	{
		StdOut.println("Buch(irgendeine Zahl) und EBook(-1)");	
		int eingabe = StdIn.readInt();
		if (eingabe == -1)						//prüft ob ein EBook(-1) eingelesen werden soll oder ein Buch(beliebige Zahl)test
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
	
	//Berechnung Durchschnittspreis und Ausgabe Buecher
	StdOut.println("Durchschnittspreis: "+ Buch.berechneDurchschnittsPreis(buchliste)+" Euro");
	
/*
 	//Aufgabe 1d
	loescheBuch(buchliste); 						//Aufruf der Methode loescheBuch 
*/

	
	for(int i=0;i<buchliste.length;i++)				//Ausgabe alle Inhalte die ungleich NULL sind
	{
		if (buchliste[i]!=null)
		{
			int counter=1;
			System.out.println("");
			System.out.println("Ausgabe "+counter+". Buch:");
			StdOut.println(buchliste[i].toString());
			counter++;
		}
	}

	
	
				
	}

	
/*
	public static void loescheBuch(Buch[] buchliste) //Aufgabe 1d, löscht 2 Bücher an stelle 2 & 3
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
