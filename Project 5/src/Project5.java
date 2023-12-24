import java.util.Scanner;
public class Project5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int SENTINEL = -1;
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		
		int positive = 0;
		int current = 3;
		int previous = current;
		int negative = 0;
		int noChange = 0;
		
		
		System.out.println("Response Dial Simulator");
		System.out.println("-----------------------");
		System.out.println("Initial Setting: " + current);
		System.out.println("Enter the next setting (1-5) or -1 to stop.");
		current = keyboard.nextInt();
		
		while(current != SENTINEL)
		{
			
			
			if(current == 1)
			{
				num1 += 1;
				
			}
			else if (current == 2)
			{
				num2 += 1;
			}
			else if (current == 3)
			{
				num3 += 1;
			}
			else if (current == 4)
			{
				num4 += 1;
			}
			else if (current == 5)
			{
				num5 += 1;
			}
			
			if(current > previous) 
			{
		
				positive += 1;
				
				System.out.println("Positive change: " + previous + " to " + current);
				
			}
			else if(current < previous)
			{
				
				negative += 1;
				
				System.out.println("Negative change: " + previous + " to " + current);
				
			}
			else
			{
				
				noChange += 1;
				
				System.out.println("No change: " + previous + " to " + current);
				
			}
			
			System.out.println("Current setting: " + current);
			System.out.println("Enter the next setting (1-5) or -1 to stop.");
			
			previous = current;
			
			
			
			current = keyboard.nextInt();
		}
		System.out.println();
		System.out.println("Response Summary");
		System.out.println("----------------");
		System.out.println("1 was chosen " + num1 + " time(s).");
		System.out.println("2 was chosen " + num2 + " time(s).");
		System.out.println("3 was chosen " + num3 + " time(s).");
		System.out.println("4 was chosen " + num4 + " time(s).");
		System.out.println("5 was chosen " + num5 + " time(s).");
		
		System.out.println();
		
		System.out.println("Positive changes: " + positive);
		System.out.println("Negative changes: " + negative);
		System.out.println("No changes: " + noChange);
		
		keyboard.close();
	}

	}
	
	
	

	
	
