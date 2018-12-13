package p_vierGewinnt_Uebung7;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SpielFeld {
	
	//nicht veränderbare öffentliche Variablen vom Typ INT
	public static final int anZeilen=6;
	public static final int anSpalten=7;
	public static final int spielFeldGroeße=80;
	
	private SpielStein [][] felder = new SpielStein[anSpalten][anZeilen]; //zwei-Dimensionales Array [Zeilen][Spalten]
	
	public void spielerdran()
	{
		int counterSpieler = 0;
		int ausgabe = 0;
		
		do //Schleife d
		{
			counterSpieler++;
			
			if (counterSpieler%2 == 0)
			{
				counterSpieler = 2;				
			}
			else 
			{
				counterSpieler = 1;
			}
			
			ausgabe = frageInt(counterSpieler+". Spieler, welche Spalte?");
			StdOut.println("Testausgabe: "+ausgabe);
			StdOut.println();
			
		}while(ausgabe !=0);
/*		
		int spieler;
		int eingabeSpalte;
		int countSpieler = 1;
		
		do
		{
			StdOut.println(countSpieler+". Spieler, in welche Spalte möchten Sie den Stein setzen? ");
			eingabeSpalte = StdIn.readInt();
						
		}while(eingabeSpalte != 0);
*/		
		
	}
	public static int frageInt(String frage)
	{
		StdOut.print(frage);
		int zahl = StdIn.readInt();
		return zahl;
	}
	
	
	public boolean steinHinzufuegen(int spalte, boolean farbe)
	{
		boolean gelegt = false;
		
		SpielStein stein = new SpielStein(farbe); 			//erstellt Objekt "stein" der Klasse SpielStein
		
			for(int zeile=0; zeile<anZeilen; zeile++)
			{
			
				if(felder[spalte-1][zeile] == null)
				{
					felder[spalte-1][zeile] = stein;			//setzt das Objekt "stein" an zeile ....
					gelegt = true;								//Variable gelegt wird 
					break;										//break sonst wird die ganze Spalte mit farben gesetzt
				}
				
			}
		
		return gelegt;											//Rückgabewert 
		
	}

	public void legeStein(int spalte, int zeile, boolean farbe)
	{
		SpielStein stein = new SpielStein(farbe);			//erstellt Objekt "stein" der Klasse SpielStein
		felder[spalte][zeile] = stein; 						//lege an Spalte X und Zeile Y den "stein"
	}
	
	public void zeichneSpielfeld() 
	{
				
		//Spielfeld groeße zeichnen
		StdDraw.setXscale(0,spielFeldGroeße);
		StdDraw.setYscale(0,spielFeldGroeße);
		
		final int breite = spielFeldGroeße/anSpalten;
		final int hoehe = spielFeldGroeße/anZeilen;
		final int radius = Math.min(breite, hoehe)/2-1;
		
		
		for(int zeile=0; zeile<anZeilen;zeile++)			//Verschachtelte FOR-Schleife, welche die 
		{
			for(int spalten=0; spalten<anSpalten; spalten++)
			{
			StdDraw.setPenColor(StdDraw.BLACK);										//zeichnet die Umrandung der Kreise wieder Schwarz
			StdDraw.circle(spalten*breite+breite/2, zeile*hoehe+hoehe/2, radius); 	//zeichnen der Kreise(x-Achse, y-Achse, Radius)
			
			if(felder[spalten][zeile] != null) 										//überprüft ob was im Array steht
			{
				felder[spalten][zeile].zeichne(spalten*breite+breite/2, zeile*hoehe+hoehe/2, radius); //zeichnet den ausgefüllten Kreis
			}
			
			
			}
		}

		
/*		
		for(int zeile=0; zeile<anZeilen; ++zeile)
		{
			for(int spalte=0; spalte<anSpalten; ++spalte)
			{
				int xCenterPos = spalte*zellBreite+zellBreite/2;
				int yCenterPos = zeile*zellHoehe+zellHoehe/2;
				
				//zeichne Feld
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.circle(x, y, radius);
				
				
			}
		}
*/
		
		
		
	}

}
