package p_Vererbung_Uebung9;

public class Student extends Person
{
	private int matrikelnummer;
	private int creditpoints;
	
	public Student (String vorname, String nachname, String geburtsdatum, int matrikelnummer, int creditpoints) 
	{
		super(vorname, nachname, geburtsdatum);
		this.matrikelnummer = matrikelnummer;
		this.creditpoints = creditpoints;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public int getCreditpoints() {
		return creditpoints;
	}

	public void setCreditpoints(int creditpoints) {
		this.creditpoints = creditpoints;
	}
	
	public String toString()
	{
		return super.toString()+ " ( Matrikelnummer: "+ this.matrikelnummer+" Creditpoints: "+ this.creditpoints+ ")";	//nutz durch das Schlüsselwort "SUPER", die toString-Methode der Oberklasse
																			//mit erweiterung der neuen Instanzvariablen
	}
	
	

}
