package p_Uebung6;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class BuchVerwaltung {

	
	
	public static void main(String[] args) 
	{
	
	StdOut.print("Wie viele Buecher moechten Sie einlesen? ");
	Buch[] buecherArray = new Buch[StdIn.readInt()];
	
	//Schleife zum einlesen ins Array
	for(int i=0; i<buecherArray.length;i++)
	{
	StdOut.print("Buchname: ");
	String nameBuch = StdIn.readString();
	StdOut.print("Artikelnummer: ");
	int artikelnummer=StdIn.readInt();
	StdOut.print("Preis: ");
	double preis = StdIn.readDouble();
	StdOut.print("Bestand: ");
	int bestand = StdIn.readInt();
	
	buecherArray[i]=new Buch(nameBuch, artikelnummer, preis,bestand); //neues Objekt Buch wird erstellt
	}
	
	
	//Ausgabe aller Buecher
	for(int i=0; i<buecherArray.length;i++)
	{
		StdOut.println(buecherArray[i]);
	}
	
	//Berechnung und Ausgabe Buecher
	StdOut.println("Durchschnittspreis: "+ Buch.berechneDurchschnittsPreis(buecherArray)+" €");
	

	loescheBuch(buecherArray); //Aufruf der Methode loescheBuch 
	
	//Ausgabe alle Inhalte die ungleich NULL sind
	for(int i=0;i<buecherArray.length;i++)
	{
		if (buecherArray[i]!=null)
		{
			StdOut.println(buecherArray[i].toString());
		}
	}
	
	
				
	}
	
	public static void loescheBuch(Buch[] buecherArray) //Aufgabe 1d, löscht 2 Bücher an stelle 2 & 3
	{
		//Elemente auf NULL setzen
		for(int i=0; i<buecherArray.length;i++)
		{
			int x=1;
			int y=2;
			
			buecherArray[x]=null;
			buecherArray[y]=null;
		}
	}
	
	
	
	
	
	
	
	/*
	public static Buch erfasseBuch()
	{
		StdOut.print("Buchname: ");
		String nameBuch = StdIn.readString();
		StdOut.print("Artikelnummer: ");
		int artikelnummer=StdIn.readInt();
		StdOut.print("Preis: ");
		double preis = StdIn.readDouble();
		StdOut.print("Bestand: ");
		int bestand = StdIn.readInt();
		
		Buch array = new Buch(nameBuch, artikelnummer, preis,bestand); //neues Objekt Buch wird erstellt
		return array; //Objekt wird zurück gegeben
		
	}
	*/
	
	/*
	public void erfasseBuecher(int methArray[])
	{
			//Buch[] array = new Buch[anzahl];
			
			for(int i=0; i<methArray.length; i++)
			{
				
				//erfasseBuch();
			}
	}
	*/
	
	
	
	

}
