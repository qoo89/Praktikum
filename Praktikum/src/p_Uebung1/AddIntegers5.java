package p_Uebung1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class AddIntegers5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variablen
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int sum;
		
		StdOut.println("Dieses Programm Addiert zwei Zahlen!");
		
		//zahl1 einlesen
		StdOut.print("Bitte geben Sie die erste Zahl ein: ");
		n1 = StdIn.readInt();
		
		//zahl2 einlesen
		StdOut.print("Bitte geben Sie die zweite Zahl ein: ");
		n2 = StdIn.readInt();
		
		//Zahl3 einlesen
		StdOut.print("Bitte geben Sie die dritte Zahl ein: ");
		n3 = StdIn.readInt();
		
		//Zahl4 einlesen
		StdOut.print("Bitte geben Sie die vierte Zahl ein: ");
		n4 = StdIn.readInt();
		
		//Zahl5 einlesen
		StdOut.print("Bitte geben Sie die fuenfte Zahl ein: ");
		n5 = StdIn.readInt();
						
		//Additions-Ergebnis der 5 Zahlen
		sum = n1 + n2 + n3 + n4 + n5;
		
		StdOut.println("Das Ergebnis der fuenf Zahlen ist: " +sum);

	}

}
