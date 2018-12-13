package p_Uebung1;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class AddUhrzeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variablen
		
				int uhrzeitStun1;
				int uhrzeitMin1;
				
				int uhrzeitStun2;
				int uhrzeitMin2;
				
				int uhrStunEr1;
				int uhrMinEr1;
				
				
				StdOut.println("Geben Sie in diesem Programm zwei Uhrzeiten ein! ");
				StdOut.println("Die zweite Uhrzeit muss groesser sein als die erste! ");
				
				
				//Uhrzeiten einlesen
				
				StdOut.print("Geben Sie die Stunden erste Uhrzeit ein: ");
				uhrzeitStun1 = StdIn.readInt();
				StdOut.print(":");
				uhrzeitMin1 = StdIn.readInt();
				
			
				StdOut.print("Geben Sie die Stunden zweite Uhrzeit ein: ");
				uhrzeitStun2 = StdIn.readInt();
				StdOut.print(":");
				uhrzeitMin2 = StdIn.readInt();
					
				//Berechnung
				
				uhrStunEr1 = (uhrzeitStun2 - uhrzeitStun1)*60;
				uhrMinEr1 = uhrzeitMin2 - uhrzeitMin1;
				
				int gesamt = uhrStunEr1 + uhrMinEr1;
				int gesMin = gesamt%60;
				int gesStu = gesamt/60;
				
				//Ausgabe
				
				//StdOut.println("Abstand zwischen den Uhrzeiten in Minuten: " +uhrStunEr1 );
				//StdOut.println("Minuten: " +uhrMinEr1);
				
				
				StdOut.println("Abstand zwischen den Uhrzeiten in Minuten betraegt: " +gesamt);
				
				StdOut.println("Anzeige in Stunden & Minuten: " +gesStu+ " : " +gesMin);
		
		
		
	}

}
