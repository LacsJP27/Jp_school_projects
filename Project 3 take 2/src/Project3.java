import java.util.Scanner;

public class Project3 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the name of the yarn specified by your pattern.");
	
	String name1 = keyboard.nextLine();
	
	System.out.println("Enter the number of balls of " + name1 +" that are required. ");
	
	int numBalls1 = keyboard.nextInt();
	
	System.out.println("Enter the number of yards per ball of " + name1);
	
	int yardsPerBall1 = keyboard.nextInt();
	
	keyboard.nextLine();
	
	System.out.println("Enter the name of the substitute yarn.");
	
	String name2 = keyboard.nextLine();
	
	System.out.println("Enter the number of yards per ball of " + name2 + ".");
	
	int yardsPerBall2 = keyboard.nextInt();
	
	int numBalls2 = (int)Math.ceil((double)(numBalls1 * yardsPerBall1) / yardsPerBall2);
	

	 
	System.out.println("You should purchase " + numBalls2 + " balls of " + name2 + " instead of " + numBalls1 + " balls of " + name1 + ".");
	keyboard.close();
}
}
