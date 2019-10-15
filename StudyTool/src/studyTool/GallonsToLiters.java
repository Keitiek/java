package studyTool;

import java.util.Scanner;// Import the Scanner class

public class GallonsToLiters {

	public static void main(String[] args) {
		//m‰‰rab ‰ra, kui palju on 1L  gallonid
		double litersInGallons = 3.78541178;
		Scanner scanGallons = new Scanner(System.in);// Create a Scanner object
		//To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:
		double gallonsAmount;// annab 
		System.out.println("Enter the amount:");
		gallonsAmount = scanGallons.nextDouble(); // Read user input
		double liters = gallonsAmount*litersInGallons;
		System.out.println(gallonsAmount + " gallons is "+liters+" liters.");// Output user input
	}

}
