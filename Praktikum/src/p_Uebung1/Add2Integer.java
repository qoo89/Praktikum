package p_Uebung1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class Add2Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variablen
				int n1;
				int n2;
				int sum;
				
				StdOut.println("Dieses Programm Addiert zwei Zahlen!");
				StdOut.print("Bitte geben Sie die erste Zahl ein: ");
				
				//zahl1 einlesen
				n1 = StdIn.readInt();
				
				StdOut.print("Bitte geben Sie die zweite Zahl ein: ");
				//zahl2 einlesen
				n2 = StdIn.readInt();
				
				sum = n1 + n2;
				
				StdOut.println("Das Ergebnis der zwei Zahlen ist: " +sum);

	}

}
