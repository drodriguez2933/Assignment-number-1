import java.util.Scanner;

public class TestPoint {
	
	public static void main(String Args[]){
		
		//creates integers for points
		int x1;
		int x2;
		int y1;
		int y2;
		
		//Creates scanner
		Scanner find = new Scanner(System.in);
		
		//find x and y for the first coordinate
		System.out.println("What is the value of x for the first coordinate?");
		x1 = find.nextInt();
		System.out.println("What is the value of y for the first coordinate?");
		y1 = find.nextInt();
		
		//creates construct 'first'
		ThePoint first = new ThePoint(x1, y1);
		
		//prints first coordinates
		System.out.println("Your first coordiantes are (" + first.getx() + "," + first.gety()+ ")");
		
		//find x and y for the second coordinate
		System.out.println("What is the value of x for the second coordinate?");
		x2 = find.nextInt();
		System.out.println("What is the value of y for the second coordinate?");
		y2 = find.nextInt();
		
		//creates construct 'second'
		ThePoint second = new ThePoint(x2, y2);
		
		//prints out second coordinates
		System.out.println("Your second coordiantes are (" + second.getx() + "," + second.gety()+ ")");
		
		//calculates distance between both coordinates
		ThePoint dist = new ThePoint();
		dist = dist.distance(first, second);
		
		System.out.println("The distance between both points is (" + dist.getx() + "," + dist.gety() + ").");
		
		find.close();
		
		
		
	}

}
