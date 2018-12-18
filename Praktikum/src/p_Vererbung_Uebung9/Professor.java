package p_Vererbung_Uebung9;

public class Professor extends Person{

	String lehrgebiet;
	
	public Professor(String vorname, String nachname, String geburtsdatum, String lehrgebiet) {
		
		super(vorname, nachname, geburtsdatum);
		this.lehrgebiet = lehrgebiet;
		
		
		
	}

	public String getLehrgebiet() {
		return lehrgebiet;
	}

	public void setLehrgebiet(String lehrgebiet) {
		this.lehrgebiet = lehrgebiet;
	}
	public String toString()
	{
	return super.toString()+ " ("+ this.lehrgebiet+ ")";
	}

}
