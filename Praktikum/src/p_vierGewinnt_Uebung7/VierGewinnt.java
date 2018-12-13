package p_vierGewinnt_Uebung7;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class VierGewinnt {
	
	

	public static void main(String[] args) {
		
		boolean farbe = true;
		boolean gelegt;
		
		SpielFeld spielFeld = new SpielFeld(); 			//neues Objekt vom Typ SpielFeld mit Namen "spielFeld"
		spielFeld.zeichneSpielfeld(); 					//Objekt "spielFeld", welches die Methode "zeichneSpielfeld" aufruft, erstellt Spielfeld
	
		//spielFeld.spielerdran();
		
		//spielFeld.legeStein(3,3,true);
		//spielFeld.legeStein(4,4,false);
		
		//spielFeld.zeichneSpielfeld();
		
		
		while(true)
		{
			int spalte = SpielFeld.frageInt("In welche Spalte wollen Sie setzen? Eingabe: ");
			
			gelegt = spielFeld.steinHinzufuegen(spalte, farbe);
			
			if (gelegt == false)									//wenn gelegt == false, dann ist die Spalte voll
			{
				StdOut.println("Spalte ist voll!!!");
				StdOut.println("Benutzen Sie eine andere Spalte!!!");
				continue;											
			}
			spielFeld.zeichneSpielfeld();
			farbe = !farbe;											//farbe wird gewechselt
		}
	
		
		
	}

}
