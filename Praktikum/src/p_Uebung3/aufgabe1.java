package p_Uebung3;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double maxPkt;
		double note;
		double pktZahl;
		
		// dynamische eingabe der Punkte!
		//solange maxPkt kleiner 0, wird die Aufforderung wiederholt 
		do
		{
		StdOut.println("max Punktzahl der Klausur?");
		StdOut.print("Eingabe: ");
		maxPkt = StdIn.readInt();
		}while(maxPkt<=0);
		
		
		int anzTei=1;
		while(true)
		{			
			//Zaehlt die Anzahl der Teilnehmer
			StdOut.println(anzTei+". Teilnehmer"); //gibt aus der wievielte Teilnehmer gerade eingegeben wird
			anzTei++;
			
			StdOut.println("Wie viele Punkte von "+maxPkt+ " wurden erreicht?");
			StdOut.print("Eingabe: ");
			pktZahl = StdIn.readInt();
			
			note = 4-((pktZahl-maxPkt/2)/(maxPkt/2)*3); //Formel zum berechner der Note
			
			
			if(pktZahl<-1 || pktZahl>maxPkt) //wiederholte Eingabe bei Eingabe kleiner -1 oder größer Maximal Punktezahl
			{
				continue;
			}
			
			
			if(pktZahl==-1) //Abbruch des Programms wenn Eingabe = -1!
			{
				break;
			}
			
			//If-Else, prueft ob die Note größer 4,0 ist, falls ja "Durchgefallen"
			//sonst Ausgabe mit Switch-Case!
			if(note>4.0)
			{
				StdOut.println("Durchgefallen!! ");
				
			}else
			{
				
				note = note +0.5;
				switch((int)note) //Note um 0,5 Punkte erhoehen, da CastOperator "Int" immer abschneidet
				{		
					case 1:	StdOut.println("Note: "+note+" Sehr gut!!");
							break;
					case 2:	StdOut.println("Note: "+note+" Gut!!");
							break;
					case 3:	StdOut.println("Note: "+note+" Befriedigend!!");
							break;
					case 4:	StdOut.println("Note: "+note+" Ausreichend!!");
							break;
		
					
				}
			}
			
		}
		
		
	
		
		
		
	}

}
