

public class Driver {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(5, 5, 5);
		System.out.println("The three sides of the legal triangle are: " + triangle1.getSideA() + " " + triangle1.getSideB() + " " + triangle1.getSideC() + " ");
		
		
		triangle1.setSideA(9);
		triangle1.setSideB(6);
		triangle1.setSideC(7);
		System.out.println("A was set to 9, then B to 6 and C to 7: " + triangle1.toString());
		System.out.println();
		
		Triangle triangle2 = new Triangle(2, 2, 10);
		
		System.out.println("The illegal triangle contained: " + triangle2.toString());
		
		triangle2.setSideA(7);
		
		System.out.println("Changed side A to 7: " + triangle2.toString());
		
		triangle2.setSideB(-10);
		
		System.out.println("Changed side B to -10: " + triangle2.toString());
		
		
		triangle2.setSideC(21);
		
		System.out.println("Changed side C to 21: " + triangle2.toString());
		
		
	}

}
