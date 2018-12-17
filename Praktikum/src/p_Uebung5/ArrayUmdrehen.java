package p_Uebung5;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class ArrayUmdrehen {
	
	public static void main(String[] args) //Aufgabe 4a und 4b
	{
		// TODO Auto-generated method stub
		int[] array;
		int groeﬂe=1; //um einen Wert mitzugeben
		
		array = methoden.frageArray("Wie viele Zahlen sollen eingegeben werden? ", groeﬂe);
		StdOut.print("1.Array:  ");
		for(int i=0; i<array.length; i++)
		{
			StdOut.print(array[i] + " ");
		}
		
		StdOut.println();
		
		int[] array2;
		array2 = methoden.arrayTausch(array);
		StdOut.print("2.Array:  ");
		for(int i=0; i<array.length; i++)
		{
			StdOut.print(array2[i] + " ");
		}
	}
	

}
