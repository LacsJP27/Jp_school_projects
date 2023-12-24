import java.util.Scanner;
public class Project4 {
	public static void main (String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int yesCount = 0;
		int noCount = 0;
		String answer;
		
		System.out.println("Answer yes or no to the following questions");
		
		
		System.out.println("I am losing my sense of humor.");
		answer = keyboard.nextLine();
		if (answer.equalsIgnoreCase("yes")) 
		{
			yesCount = yesCount + 1;
		}
		else {
			noCount = noCount + 1;
		}
		
		
		System.out.println("I find it more and more difficult to see people socially.");
		answer = keyboard.nextLine();
		if (answer.equalsIgnoreCase("yes")) 
		{
			yesCount = yesCount + 1;
		}
		else {
			noCount = noCount + 1;
		}
		
		
		
		System.out.println("I feel tired most of the time.");
		answer = keyboard.nextLine();
		if (answer.equalsIgnoreCase("yes"))
		{
			yesCount = yesCount + 1;
		}
		else {
			noCount = noCount + 1;
		}
		
		
		if(yesCount > 2)
		{
			System.out.println("You are probably stressed out");
		}
			else if(yesCount > 1)
			{
				System.out.println("You are possibly stressed out");
			}
			else if(yesCount > 0)
			{
				System.out.println("You are beginning to stress out");
			}
			else 
			{
				System.out.println("You are more exhausted than stressed out");
			}
		keyboard.close();
	}

}
