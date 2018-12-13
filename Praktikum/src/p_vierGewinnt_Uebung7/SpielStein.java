package p_vierGewinnt_Uebung7;

import edu.princeton.cs.introcs.StdDraw;

public class SpielStein {

	boolean istRot;
	
	
	public SpielStein(boolean istRot)	 //Konstruktor
										//durch konvention "ist"
	{
		this.istRot=istRot;	 		
	}
	
	
	public boolean getistRot()
	{
		return this.istRot;
	}
	
	public void zeichne(int x, int y, int radius)
	{
		if(istRot)									//Wenn IstRot TRUE, dann Rot sonst male Gelb 
			StdDraw.setPenColor(StdDraw.RED);		// malt Rot
		else
			StdDraw.setPenColor(StdDraw.YELLOW);	//malt Gelb
		
		StdDraw.filledCircle(x, y, radius);			//füllt den Kreis an der stelle der übergebenen Parameter
	
	}
	
	

	

}
