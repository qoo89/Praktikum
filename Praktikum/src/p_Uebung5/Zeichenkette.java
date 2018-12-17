package p_Uebung5;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Zeichenkette {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aufgabe 1a
		StdOut.print("Welches Zeichen moechten Sie ausgeben? ");
		char zeichen = StdIn.readChar();
		StdOut.print("Wie viele Zeichen moechten Sie ausgeben? ");
		int anzahl = StdIn.readInt();
		methoden.wiederholeZeichen(zeichen,anzahl);
		
		
		//Aufgabe 1b Methodenaufruf mit Schleife für Quadrat
		/*
		StdOut.print("Geben Sie die Laenge des Quadrats ein:");
		int anzahl = StdIn.readInt();
		//Aufgabe 2b
		int min = 2;
		int max = 10;
		int anzahl = methoden.frageInt("Geben Sie die Laenge des Quadrats ein: ", min, max);
		//if(anzahl<2)
		//	return;
		char zeichen = '*';
		for(int i=1; i<=anzahl; i++)
		{
			methoden.wiederholeZeichen(zeichen,anzahl);
			StdOut.println("");
		}
		
		//Aufgabe 1c Methodenaufruf Pyramide
		/*
		StdOut.print("Geben Sie den Parameter fuer die Pyamide ein:");
		int anzahl = StdIn.readInt();
		//Aufgabe 2b
		int min = 2;
		int max = 10;
		int anzahl = methoden.frageInt("Geben Sie die Laenge der Pyramide ein: ", min, max);
		
		char zeichen = '*';
		char leerzeichen = ' ';
		int leer = anzahl;
		int stern = 1;
		
		for(int i=1; i<=anzahl; i++)
		{
			methoden.wiederholeZeichen(leerzeichen,leer);
			methoden.wiederholeZeichen(zeichen,stern);
			methoden.wiederholeZeichen(zeichen,stern-1);
			leer--;
			stern++;
			StdOut.println("");
		}
		*/
	}

}
