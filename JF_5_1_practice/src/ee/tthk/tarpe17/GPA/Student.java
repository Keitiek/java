package ee.tthk.tarpe17.GPA;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean qualified = false;
		int sat;
		double gpa;
		System.out.println("This programm will determine if you can get into Mountville University");
		System.out.println("please answer the following questions.");
		System.out.println("How many students attended your school?");
		if (in.nextInt() >= 1400) {
			System.out.println("Were you valedictorian or salutatorian of your school? Answer Y/N ");
			if (in.next().toUpperCase().equals("Y")) {
				qualified = true;
			}
		}
		if (!qualified) {
			System.out.println("what was oyur grade point avarage on a 4.0 scale?");
			gpa = in.nextDouble();
			System.out.println();
			sat = in.nextInt();
			if (gpa >= 4.0 && sat >= 1100 || gpa >= 3.5 && sat >= 1300 || gpa >= 3.0 && sat >= 1500) {
				qualified = true;
			}
		}
		if (qualified) {
			System.out.println("Congratulations you'vw been accepted to Mountville university");
		} else {
			System.out.println("Unfortunaly you not been  accepted to Mountville university");
		}
	}
}
