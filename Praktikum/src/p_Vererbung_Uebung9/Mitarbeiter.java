package p_Vererbung_Uebung9;

public class Mitarbeiter extends Person{
	
	int personalnummer;
	int gehalt;

	public Mitarbeiter(String vorname, String nachname, String geburtsdatum, int personalnummer, int gehalt) {
		// TODO Auto-generated constructor stub
		super(vorname, nachname, geburtsdatum);
		this.personalnummer = personalnummer;
		this.gehalt = gehalt;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}
	public String toString()
	{
	return super.toString()+ " ("+ this.personalnummer+ this.gehalt+ ")";
	}
}
