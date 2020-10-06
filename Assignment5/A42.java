//42.Create a class Tile to store the edge length of a square tile, and create another 
//class Floor to store length and width of a rectangular floor. Add method 
//totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole 
//number of tiles needed to cover the floor completely.

package Asgmt;

import java.util.*;

class Tile{	
	int tlength,twidth;
	
	Tile(int tlength,int twidth)
	{
		this.tlength=tlength;
		this.twidth=twidth;
	}
	
	int ttiles(int flength,int fwidth)
	{
		int tarea=tlength*twidth;
		int farea=flength*fwidth;
		int ttiles=(farea/tarea);
		return ttiles;
	}
}

public class A42 {
	int length,width,total;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		A42 f=new A42();
		
		System.out.println("Enter length of the tile: ");
		f.length=scan.nextInt();
		System.out.println("Enter width of the tile: ");
		f.width=scan.nextInt();
		Tile t=new Tile(f.length,f.width);
		
		
		System.out.println("\n Enter length of the floor: ");
		f.length=scan.nextInt();
		System.out.println("Enter width of the floor: ");
		f.width=scan.nextInt();
		
		f.total=t.ttiles(f.length,f.width);
		System.out.println("\n Total tiles needed: "+f.total);

		
	}
}
