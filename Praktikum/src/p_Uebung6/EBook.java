package p_Uebung6;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class EBook extends Buch 	//EBook ist eine Unterklasse von Buch, erkennbar durch "extends"
{

	private int dateiGroeße;
	private String format;
	
	
	public EBook(String nameBuch, int artikelnummer, double preis, int bestand, int dateiGroeße, String format) 
	{
		super(nameBuch, artikelnummer, preis, bestand); //kommen aus der Oberklasse Buch
		this.dateiGroeße = dateiGroeße;
		this.format=format;
			
	}
	
	//GetMethoden zum abbrufen
	public int getdateiGroeße()
	{
		return this.dateiGroeße;
	}
	public String getformat()
	{
		return this.format;
	}
	
	//toString ausgabe
	public String toString()
	{
		return super.toString()+ " ( DateiGroeße: "+ this.dateiGroeße + " Format: "+ this.format + ")";	//nutz durch das Schlüsselwort "SUPER", die toString-Methode der Oberklasse
																										//mit erweiterung der neuen Instanzvariablen
	}
	
	public static Buch erfasseEbook()
	{
		StdOut.print("Buchname: ");
		String nameBuch = StdIn.readString();
		StdOut.print("Artikelnummer: ");
		int artikelnummer=StdIn.readInt();
		StdOut.print("Preis: ");
		double preis = StdIn.readDouble();
		StdOut.print("Bestand: ");
		int bestand = StdIn.readInt();
		StdOut.print("Dateigroeße: ");
		int dateiGroeße = StdIn.readInt();
		StdOut.print("Format: ");
		String format = StdIn.readString();
		
		
		Buch arrayEbook = new EBook(nameBuch, artikelnummer, preis,bestand, dateiGroeße ,format); //neues Objekt Buch wird erstellt
		return arrayEbook; //Objekt wird zurück gegeben
		
	}
	
	
	

}
