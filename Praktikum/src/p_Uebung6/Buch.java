package p_Uebung6;

import edu.princeton.cs.introcs.StdOut;

public class Buch {

	//Instanzvariablen
	private String nameBuch;
	private int artikelnummer;
	private double preis;
	private int bestand;
	
	public Buch(String nameBuch, int artikelnummer, double preis, int bestand) //Konstruktor für Klasse Buch, übernimmt Instanzvariablen
	{
		// TODO Auto-generated constructor stub
		
		this.nameBuch=nameBuch;
		this.artikelnummer=artikelnummer;
		this.preis=preis;
		this.bestand=bestand;
		
		
				
	}
	
	//Methode berechnung des Durchschnittspreises
	public static double berechneDurchschnittsPreis(Buch[] buecher)
	{
		int anzahl=0;
		double summe=0;
		for(int i=0; i<buecher.length; i++)
		{
			anzahl = anzahl + buecher[i].getbestand();
			summe = summe +buecher[i].getbestand()*buecher[i].getpreis();
			StdOut.println("Anzahl: "+anzahl);
			StdOut.println("Summe: "+summe);
		}
		return summe/anzahl;
		
	}
	
	
	//Getter- und Setter-Methoden
	public String getNameBuch()
	{
	return this.nameBuch;
	}
	public int getartikelnummer()
	{
		return this.artikelnummer;
	}
	public double getpreis()
	{
		return this.preis;
	}
	public int getbestand()
	{
		return this.bestand;
	}
	
	public void setpreis(double preis)
	{
		this.preis=preis;
	}
	public void setbestand(int bestand)
	{
		this.bestand=bestand;
	}
	
	//toString - Methode
	@Override
	public String toString()
	{
		return ("Buchname: "+this.nameBuch + " \nArtikelnummer: " + this.artikelnummer+ " \nPreis: " + this.preis+ " \nBestand: "+this.bestand);
	}
	
	
}
