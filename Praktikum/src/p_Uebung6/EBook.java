package p_Uebung6;

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
		return super.toString()+ " ("+ this.dateiGroeße + this.format+")";	//nutz durch das Schlüsselwort "SUPER", die toString-Methode der Oberklasse
																			//mit erweiterung der neuen Instanzvariablen
	}
	
	
	

}
