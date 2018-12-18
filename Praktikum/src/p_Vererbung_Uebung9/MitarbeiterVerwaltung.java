package p_Vererbung_Uebung9;

import edu.princeton.cs.introcs.StdOut;

public class MitarbeiterVerwaltung {

	public static void main(String[] args) 
	{
		//HardCopy codierte Einträge erschiedener Klassen der Super-Klasse
		Person p1 = new Person("Dennis","Ewers","03.10.1989");
		Person s1 = new Student("Julian", "Buchheister", "01.01.1900", 1815 , 12);
		Person m1 = new Mitarbeiter ("Michael", "Miller", "06.01.1963",1111, 2000);
		Person pr1 = new Professor("Peter","Mueller","02.03.1978","DB");
		
		//Aufgabe 3a - Speichern im Array
		Person[] PersoArray = new Person[4]; //Array mit 4 Speicherplätzen
		PersoArray[0] = p1;
		PersoArray[1] = s1;
		PersoArray[2] = m1;
		PersoArray[3] = pr1;


		//Aufgabe 3a und 3b - Ausgabe aus dem Array
		
		for(int i=0; i<PersoArray.length; i++)
		{

			if(PersoArray[i] instanceof Student)		//prüft von welcher KLASSE der Eintrag im Array ist!!
			{
				StdOut.print("Ausgabe: ");
				StdOut.println(PersoArray[i].toString()+" Klasse Student");
			}else if(PersoArray[i] instanceof Mitarbeiter)
			{
				StdOut.print("Ausgabe: ");
				StdOut.println(PersoArray[i].toString()+" Klasse Mitarbeiter");
			}else if(PersoArray[i] instanceof Professor)
			{
				StdOut.print("Ausgabe: ");
				StdOut.println(PersoArray[i].toString()+" Klasse Professor");
			}else if(PersoArray[i] instanceof Person)
			{
				StdOut.print("Ausgabe: ");
				StdOut.println(PersoArray[i].toString()+" Klasse Person");
			}

		
			
			//StdOut.print("Ausgabe: ");
			//StdOut.println(PersoArray[i].toString());
						
		}

/*
		//TestAusgabe
		StdOut.println(p1);
		StdOut.println(s1);
		StdOut.println(m1);
		StdOut.println(pr1);

*/		

		
		
		
		

	}

}
