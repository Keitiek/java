package ee.tthk.tarpe17.Planets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Planets {
	public static void main(String[] args) {

		Map<String, Double> planetCoeficents = new HashMap<String, Double>() {
			{

				put("Mercury", 0.38);
				put("Venus", 0.91);
				put("Mars", 0.38);
				put("Jupiter", 2.36);
				put("Saturn", 0.92);
				put("Uranus", 0.89);
				put("Neptune", 1.13);
			}
		};

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your weigth on Earth");
		double weigth = in.nextDouble();
		System.out.println();
		for (String planet : planetCoeficents.keySet()) {
			System.out.println(planet);
		}
		System.out.println("Enter the number of your chosen planet");
		String choice = in.next();
		double chosencoeficent = planetCoeficents.getOrDefault(choice, 1.0);
		if (chosencoeficent == 1.0) {
			choice = "Earth";
		}
		System.out.println("Your weigth on" + choice + " is " + weigth * chosencoeficent);

		/*Scanner in = new Scanner(System.in);
		double answer = 0;
		System.out.println("Enter your weight on Earth : ");
		Double EarthWeight = in.nextDouble();
		System.out.println("Enter the planet : ");
		String planet = in.next();
		switch (planet) {
		case "Mercury":
			answer = EarthWeight * 0.38;
			break;
		case "Venus":
			answer = EarthWeight * 0.91;
			break;
		case "Mars":
			answer = EarthWeight * 0.38;
			break;
		case "Jupiter":
			answer = EarthWeight * 2.36;
			break;
		case "Saturn":
			answer = EarthWeight * 0.92;
			break;
		case "Uranus":
			answer = EarthWeight * 0.89;
			break;
		case "Neptune":
			answer = EarthWeight * 1.13;
			break;
		}
		System.out.println("Your weight on " + planet + " is " + answer);*/
	}
}
