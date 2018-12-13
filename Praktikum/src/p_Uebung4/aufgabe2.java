package p_Uebung4;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		double summe=0;
		
		StdOut.println("Wie viele Zahlen moechten Sie einlesen?");
		int anzahl = StdIn.readInt();
		
		double[] array = new double[anzahl];
		
		for(int i=0; i<array.length; i++)
		{
			StdOut.println("Geben Sie die "+(i+1)+" von "+array.length+" Zahlen ein!");
			array[i]=StdIn.readDouble();
			//Berechnung
			summe = summe + array[i];
			
		}
		
		double mittelwert = summe / array.length;
		StdOut.println("Mittelwert: "+mittelwert);
		
		//höchste Zahl
		double hzahl = array[0];
		
		for(int j=0; j<array.length; j++)
		{
			if(hzahl<array[j])
			{
				hzahl = array[j];
			}
		}
		StdOut.println("Die hoechste Zahl ist: "+hzahl);
		
		//niedrigste Zahl
				double nzahl = array[0];
				
				for(int j=0; j<array.length; j++)
				{
					if(nzahl>array[j])
					{
						nzahl = array[j];
					}
				}
				
				
				StdOut.println("Die niedrigste Zahl ist: "+nzahl);
		

	}

}
