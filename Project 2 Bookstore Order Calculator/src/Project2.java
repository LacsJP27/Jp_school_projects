// JP Lacsamana and Ian Dang

public class project2Bookstore {
	public static void main(String[] args)
	{
		String book1 = "Three Sisters";
		String book2 = "Song of Solomon";
		String book3 = "Owls do not have to Mean Death";
		
		String author1 = "Bi Feiyu";
		String author2 = "Toni Morrison";
		String author3 = "Chip Livingston";
		
		double price1 = 18.99;
		double price2 = 11.99;
		double price3 = 80.50;
		
		int numCopies1 = 2;
		int numCopies2 = 4;
		int numCopies3 = 1;
		
		final double TAX_RATE = 0.0875;
		
		double pretaxTotal = (price1 * numCopies1) + (price2 * numCopies2) + (price3 * numCopies3);
		double salesTax = TAX_RATE * pretaxTotal;
		double totalOrder = pretaxTotal + salesTax;
		
		
		
		System.out.println("Purchase " + numCopies1 + " copy of " + book1 + ", " + author1 + "." + " Each copy costs $" + String.format("%.2f", price1) + ".");
		
		System.out.println("Purchase " + numCopies2 + " copy of " + book2 + ", " + author2 + "." + " Each copy costs $" + String.format("%.2f", price2) + ".");
		
		System.out.println("Purchase " + numCopies3 + " copy of " + book3 + ", " + author3 + "." + " Each copy costs $" + String.format("%.2f", price3) + ".");
		
		System.out.println("Total before tax: $" + String.format("%.2f", pretaxTotal));
		
		System.out.println("Sales tax: $" + String.format("%.2f", salesTax));
		
		System.out.println("The total cost of your order will be $" + String.format("%.2f", totalOrder));
		
		
		
		
	}

}
