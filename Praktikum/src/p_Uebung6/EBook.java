package p_Uebung6;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class EBook extends Buch 	//EBook ist eine Unterklasse von Buch, erkennbar durch "extends"
{

	private int dateiGroe�e;
	private String format;
	
	
	public EBook(String nameBuch, int artikelnummer, double preis, int bestand, int dateiGroe�e, String format) 
	{
		super(nameBuch, artikelnummer, preis, bestand); //kommen aus der Oberklasse Buch
		this.dateiGroe�e = dateiGroe�e;
		this.format=format;
			
	}
	
	//GetMethoden zum abbrufen
	public int getdateiGroe�e()
	{
		return this.dateiGroe�e;
	}
	public String getformat()
	{
		return this.format;
	}
	
	//toString ausgabe
	public String toString()
	{
		return super.toString()+ " ("+ this.dateiGroe�e +" "+ this.format + ")";	//nutz durch das Schl�sselwort "SUPER", die toString-Methode der Oberklasse
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
		StdOut.print("Dateigroe�e: ");
		int dateiGroe�e = StdIn.readInt();
		StdOut.print("Format: ");
		String format = StdIn.readString();
		
		
		Buch arrayEbook = new EBook(nameBuch, artikelnummer, preis,bestand, dateiGroe�e ,format); //neues Objekt Buch wird erstellt
		return arrayEbook; //Objekt wird zur�ck gegeben
		
	}
	
	
	

}
