package p_Uebung5;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class MaxZahlenUndArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//Aufgabe 3a 
				/*
				int a =  StdIn.readInt();
				int b =  StdIn.readInt();
				StdOut.print(methoden.maximum2int(a,b)); 
				*/
		//Aufgabe 3b
				int []array;
				array = new int [5];
				for(int i=0; i<5; i++)
				{
					StdOut.print(i +". Zahl eingeben: ");
					array[i] = StdIn.readInt();
				}
				StdOut.print(methoden.maxArray(array));
				
				
		//Aufgabe 3c
				/*
				int[] array;
				int gr=5;
				
				array = methoden.frageArray("Wie viele Zahlen sollen eingegeben werden? ", gr);
				StdOut.print("Die groesste eingegebene Zahl ist: " + methoden.maxArray(array));
				*/
	}
	
	

}
