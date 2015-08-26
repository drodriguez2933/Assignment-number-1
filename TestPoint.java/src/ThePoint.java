
public class ThePoint {
	
	private int x;
	private int y;
	
	/* return the value of x */
	public int getx(){
		return x;
	}
	
	/* return the value of y */
	public int gety(){
		return y;
	}
	
	/* create default non ARG construct */
	public ThePoint(){
		this (0,0);
	}

	//create a constructor
	public ThePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//find the distance between both points
	public ThePoint distance(ThePoint first, ThePoint second){
		int xdist = first.getx() - second.getx();
		int ydist = first.gety() - second.gety();
		ThePoint distance = new ThePoint(xdist, ydist);
		return distance;
	}
	
	
}
