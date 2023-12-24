import java.text.DecimalFormat;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	private final static DecimalFormat FORMATTER = new DecimalFormat("#.###");
	private final static double DEFAULT_SIDE_LENGTH = 1.0;
	
	//CONSTRUCTORS
	
	public Triangle (double sideA, double sideB, double sideC) {
		if(isTriangle(sideA, sideB, sideC)) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		}
		else {
			this.sideA = DEFAULT_SIDE_LENGTH;
			this.sideB = DEFAULT_SIDE_LENGTH;
			this.sideC = DEFAULT_SIDE_LENGTH;
		}
	}
	//ACCESSORS
	
	public double getSideA() {
		return sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC;
	}
	
	//MUTATORS
	
	public boolean setSideA(double sideA) {
		if(isTriangle(sideA, this.sideB, this.sideC)) {
			this.sideA = sideA;
			return true;
		}
		return false;
		
	}
	
	public boolean setSideB(double sideB) {
		if(isTriangle(this.sideA, sideB, this.sideC)) {
			this.sideB = sideB;
			return true;
		}
		return false;
		
	}
	
	public boolean setSideC(double sideC) {
		if(isTriangle(this.sideA, this.sideB, sideC)) {
			this.sideC = sideC;
			return true;
		}
		return false;
		
	}
	
	//EXTRAS
	private static boolean isTriangle(double a, double b, double c) {
		if(a > 0 && b > 0 && c > 0) {
			if(a + b > c && a + c > b && b + c > a) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String roundedA = FORMATTER.format(this.sideA);
		String roundedB = FORMATTER.format(this.sideB);
		String roundedC = FORMATTER.format(this.sideC);
		
		//Triangle(<value of sideA>, <value of sideB>, <value of sideC>)
		return "Triangle(" + roundedA + ", " + roundedB +", " + roundedC + ")";
		
	}
	
}
