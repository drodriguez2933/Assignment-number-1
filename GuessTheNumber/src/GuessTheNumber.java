import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
	
	public static void main (String Args[]){
		
		int flag = 0;
		int count = 0;
		int guess;
		
		Random randomGenerator = new Random();
		
		int num = randomGenerator.nextInt(1000);
		
		Scanner scan = new Scanner(System.in);
		
		while(flag != 1){
		System.out.println("Guess the number between 1 and 1000!");
		guess = scan.nextInt();
		
		if(guess < num){
			System.out.println("Your guess was less than the number! Try Again!");
			count += 1;
		}
		else if(guess > num){
			System.out.println("Your guess was greater than the number! Try Again!");
			count += 1;
		}
		else {
			count += 1;
			System.out.println("Your guess was correct!");
			System.out.println("It too you " + count + " times to guess the number!");
			flag += 1;
		}
		}
		
		scan.close();
		
	}

}
