
public class spielFeldNeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 80;
		int y = 80;
		
		StdDraw.setXscale(0,x);
		StdDraw.setYscale(0,y);
		
		
		for(int i=12; i<x;i+=12)
		{
			for(int k=10;k<y; k+=10)
			{
			//(x,y,radius)
			StdDraw.circle(k, i, 4);
			
			}
		}
		
	}

}
