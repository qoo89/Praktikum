package p_Uebung4;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Variablen
				int unterzuckert =0;
				int ueberzuckert = 0;
				
				StdOut.print("Anzahl Personen? Eingabe: ");
				int anzahl = StdIn.readInt();
				
				int[] perso = new int [anzahl]; //Array wird erzeugt mit groeﬂe von EINGABE Anzahl
				
				for(int i=0; i<perso.length; i++)
				{
					StdOut.print(+(i+1)+". Person: Geben Sie den Blutzuckerwert ein! Eingabe: ");
					perso[i] = StdIn.readInt();
					
				}
				
				StdOut.println(" "); //Absatz
				for(int j=0; j<perso.length; j++)
				{
					//‹berpr¸fung auf unter- oder ¸berzuckert
					if(perso[j]<80)
					{
						unterzuckert++;
						StdOut.println("Die "+(j+1)+". Person hat unterzucker");
						
					}else if(perso[j]>120)
					{
						ueberzuckert++;
						StdOut.println("Die "+(j+1)+". Person hat ueberzucker");
					}
				}
				
			
				StdOut.println(" "); //Absatz
				//Prozentberechnung
				int prozentunterzuckert = (100*unterzuckert)/perso.length;
				int prozentueberzuckert = (100*ueberzuckert)/perso.length;
				
				//Ausgabe der Prozente
				StdOut.println("Anzahl Personen unterzuckert: "+unterzuckert+" in Prozent "+prozentunterzuckert+"%");
				StdOut.println("Anzahl Personen ueberzuckert: "+ueberzuckert+" in Prozent "+prozentueberzuckert+"%");
				
				
		
		

	}

}
