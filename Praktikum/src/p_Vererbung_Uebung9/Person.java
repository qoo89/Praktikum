package p_Vererbung_Uebung9;

public class Person {

	private String vorname;
	private String nachName;
	private String geburtsdatum;
	
	
	public Person(String vorname, String nachName, String geburtsdatum) 
	{
		this.vorname = vorname;
		this.nachName = nachName;
		this.geburtsdatum = geburtsdatum;
		
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachName() {
		return nachName;
	}


	public void setNachName(String nachName) {
		this.nachName = nachName;
	}


	public String getGeburtsdatum() {
		return geburtsdatum;
	}


	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	public String toString()
	{
		return ("Vorname: "+this.vorname + " Nachname: " + this.nachName+ " Geburtstag: " + this.geburtsdatum);
	}
	

}
