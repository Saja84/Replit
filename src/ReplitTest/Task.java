package ReplitTest;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    String item1, item2, item3, report;
	    double price1, price2, price3, totalPrice;

	    System.out.println("Enter Item1 and its price: ");
	    item1 = scan.next();
	    System.out.println("Enter Item2 and its price: ");
	    item2 = scan.next();
	    System.out.println("Enter Item3 and its price: ");
	    item3 = scan.next();

	    price1 = scan.nextDouble();
	    System.out.println("Item1: Tomatoes Price: " + item1);
	    price2 = scan.nextDouble();
	    System.out.println("Item2: Cheese Price: " + item2);
	    price3 = scan.nextDouble();
	    System.out.println("Item3: Apples Price: " + item3);

	    totalPrice = scan.nextDouble();
	    totalPrice += price;
	    System.out.println("Item1: Tomatoes Price: " + item1 + "," + " Item2: Cheese Price: " + item2 + ","
	        + " Item3: Apples Price: " + item3);
	    totalPrice = price1 + price2 + price3;
	    System.out.println("Total price: " + totalPrice);

	}

}
