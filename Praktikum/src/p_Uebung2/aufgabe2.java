package p_Uebung2;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Aufgabe 2a
/*
		StdOut.println("Wie viele Potenzen moechten Sie ausgegeben bekommen?");
		StdOut.print("Eingabe: ");
		int potenz = StdIn.readInt();
		int sum = 1;

		if (potenz < 1 || potenz > 31) //wenn kleiner 1 oder größer 31, dann Fehlermeldung
		{ 

			StdOut.println("!!!!!Fehler!!!!! \nEingegebene Zahl < 1 || > 31");
			StdOut.println("Neue Zahl eingeben!!!");
			
			
			
		} else {
			
			StdOut.println("Anzahl Potenzen: 2^0 = 1");
			for (int i = 1; i <= potenz; i++) {

				StdOut.print("Anzahl Potenzen: 2^" + i);

				sum = sum * 2;

				StdOut.println(" = " + sum);
			}
		}
*/
		
//Aufgabe 2b
/*
		StdOut.println("Wie viele Potenzen moechten Sie ausgegeben bekommen?");
		StdOut.print("Eingabe: ");
		int potenz = StdIn.readInt();
		int sum = 1;
		
		//prüft ob die eingegebene Zahl den Vorgaben entspricht und gibt evtl eine Fehlermeldung aus!
		if (potenz < 1 || potenz > 31) {

			StdOut.println("!!!!!Fehler!!!!! \nEingegebene Zahl < 1 || Zahl > 31");
			StdOut.println("Neue Zahl eingeben!!!");
			
			//Do-While-Schleife wiederholt die Aufvorderung so lange bis die Bedingung erfüllt ist
			do {
				StdOut.println("Geben Sie erneut eine Zahl ein!!!");
				StdOut.print("Eingabe: ");
				potenz = StdIn.readInt();
			}while(potenz < 1 || potenz >31);
			
		} 
		
		
			
		StdOut.println("Anzahl Potenzen: 2^0 = 1");
		for (int i = 1; i <= potenz; i++) 
		{
			StdOut.print("Anzahl Potenzen: 2^" + i);
			sum = sum * 2;
			StdOut.println(" = " + sum);
		}

*/

//Aufgabe 2d
/*	
		int berechnung=0;
		
		StdOut.print("Geben Sie eine Zahl ein! \nEingabe: ");
		int eingabe=StdIn.readInt();
		
		for(int i=1; i<=eingabe; i++)
		{
			berechnung = i %2;
			
			if(berechnung == 0)
			{
			StdOut.println(+i+" ,ist ein Teiler! von 2");
			}
		}
*/
		


	}

}
