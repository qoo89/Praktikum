package p_Uebung5;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;



public class methoden
{
	public static int frageInt(String frage, int min, int max)
	{
		StdOut.print(frage);
		int x =0;
		do
		{
		x = StdIn.readInt();
		if(x>max||x<min)
			StdOut.print("Verletzung der Min- oder Maxwerte! Nochmal: ");
		}while(x>max||x<min);
		return x;
	}
	
	public static void wiederholeZeichen(char zeichen, int anzahl)
	{
		for(int i=1; i<=anzahl; i++)
		{
			StdOut.print(zeichen);
		}
	}
	
	//Aufgabe 3a
		public static int maximum2int(int a, int b)
		{
			 if (a > b)
		        {
		            return a;
		        }
		        else
		        {
		            return b;
		        }
		}
		
	//Aufgabe 3b
		public static int maxArray(int[] array)
		{
			int vergleich = 0;
			
			for(int i=0; i<array.length; i++)
			{
				if(vergleich<array[i])
					vergleich= array[i];
			}
			return vergleich;
		}
	
		public static int [] arrayTausch (int[] array)
		{	
			int [] array2;
			array2 = new int [array.length];
			int count = array.length-1;
			
			for(int i=0; i<array.length; i++)
			{
				array2[count] = array[i];
				count--;
			}
			return array2;
		}
		
		public static int [] frageArray(String frage, int gr)
		{
			StdOut.print(frage);
			int []array;

			int count=0;
			gr = StdIn.readInt();
			
			array =new int [gr];
			for(int i=0; i<array.length; i++)
			{
				count = i+1;
				StdOut.print("Geben Sie die " + count + ". Zahl ein: ");
				array[i] = StdIn.readInt();
			}
			return array;
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Aufgabe 1a Methodenaufruf Zeilenausgabe Zeichen
			/*
			StdOut.print("Welches Zeichen moechten Sie ausgeben? ");
			char zeichen = StdIn.readChar();
			StdOut.print("Wie viele Zeichen moechten Sie ausgeben? ");
			int anzahl = StdIn.readInt();
			wiederholeZeichen(zeichen,anzahl);
			*/
			
			//Aufgabe 1b Methodenaufruf mit Schleife für Quadrat
			/*
			StdOut.print("Geben Sie die Laenge des Quadrats ein:");
			int anzahl = StdIn.readInt();
			//Aufgabe 2b
			int min = 2;
			int max = 10;
			int anzahl = frageInt("Geben Sie die Laenge des Quadrats ein: ", min, max);
			//if(anzahl<2)
			//	return;
			char zeichen = '*';
			for(int i=1; i<=anzahl; i++)
			{
				wiederholeZeichen(zeichen,anzahl);
				StdOut.println("");
			}*/
			
			//Aufgabe 1c Methodenaufruf Pyramide
			/*
			StdOut.print("Geben Sie den Parameter fuer die Pyamide ein:");
			int anzahl = StdIn.readInt();
			//Aufgabe 2b
			int min = 2;
			int max = 10;
			int anzahl = frageInt("Geben Sie die Laenge der Pyramide ein: ", min, max);
			
			char zeichen = '*';
			char leerzeichen = ' ';
			int leer = anzahl;
			int stern = 1;
			
			for(int i=1; i<=anzahl; i++)
			{
				wiederholeZeichen(leerzeichen,leer);
				wiederholeZeichen(zeichen,stern);
				wiederholeZeichen(zeichen,stern-1);
				leer--;
				stern++;
				StdOut.println("");
			}
			*/
			
			//Aufgabe 2a
			/*
			int min = 0;
			int max = 100;
			
			int wert = frageInt("Geben Sie einen Wert ein: ",min,max);
			*/
			
			//Aufgabe 2b
			/*
			int[] array;
			int gr=5;
			
			array = frageArray("Wie viele Zahlen sollen eingegeben werden? ", gr);
			
			for(int i=0; i<array.length; i++)
			{
				StdOut.print(+array[i]+ " ");
			}
			*/
			
			//Aufgabe 3a 
			/*
			int a =  StdIn.readInt();
			int b =  StdIn.readInt();
			StdOut.print(maximum2int(a,b)); 
			*/
			
			//Aufgabe 3b 
			/*
			int []array;
			array = new int [5];
			for(int i=0; i<5; i++)
			{
				StdOut.print(i +". Zahl eingeben: ");
				array[i] = StdIn.readInt();
			}
			StdOut.print(maxArray(array));
			*/
			
			//Aufgabe 3c
			/*
			int[] array;
			int gr=5;
			
			array = frageArray("Wie viele Zahlen sollen eingegeben werden? ", gr);
			StdOut.print("Die groesste eingegebene Zahl ist: " + maxArray(array));
			*/
			
			//Aufgabe 4a und b
			/*
			int[] array;
			int gr=5;
			
			array = frageArray("Wie viele Zahlen sollen eingegeben werden? ", gr);
			StdOut.print("1.Array:  ");
			for(int i=0; i<array.length; i++)
			{
				StdOut.print(array[i] + " ");
			}
			
			StdOut.println();
			
			int[] array2;
			array2 = arrayTausch(array);
			StdOut.print("2.Array:  ");
			for(int i=0; i<array.length; i++)
			{
				StdOut.print(array2[i] + " ");
			}
			*/
		}
	
	
	
	
	
}








/*
public class methoden {
	
	//Methode wiederholezeichen
		public static void wiederholeZeichen(char zeichen, int anzahl)
		{
			for(int i=1; i<=anzahl; i++)
			{
				StdOut.print(zeichen);
			}
		}
		
		
			public static void main(String[] args) {
			
			int anzahl;
			char zeichen = '*';
			StdOut.print("Wie viele Zeichen moechten Sie ausgeben?: ");
			anzahl = StdIn.readInt();
			
			
/*
					
			//Anzahl Zeichen mindestens 2!!!
			if(anzahl<2)
				anzahl=2;
			
			//Gibt das Quadrat aus
			for(int j=1;j<=anzahl;j++)
			{
				wiederholeZeichen(zeichen,anzahl);
				StdOut.println("");
			}
*/
/*			
			//Pyramide
			StdOut.println("");
			StdOut.println("!!!!!Pyramide!!!!!");
			
			char leerzeichen = ' ';
			int leer=anzahl;
			int stern = 1;
			
			for(int k=1;k<=anzahl;k++)
			{
				wiederholeZeichen(leerzeichen, leer);
				wiederholeZeichen(zeichen,stern);
				wiederholeZeichen(zeichen,stern-1);
				leer--;
				stern++;
				
				
				StdOut.println("");
			}
			
			
			
/*
			//jede Zeile einmal durchlaufen
			for(int i=0; i<anzahl; i++)
			{
							
				//Ausgabe Leerzeichen
				for(int j=0; j<anzahl-1-i; j++)
				{
					StdOut.print(" ");
				}
				//
				for(int k=0; k<i*2+1; k++)
				{
					//Sterne Ausgabe
					StdOut.print("*");
				}
				
				//Zeilenumbruch nach jeder Zeile
				StdOut.println();
			}
*/
	
	
	

			
			

