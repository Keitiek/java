package ee.tthk.tarpe17.Painter;

import java.util.Scanner;

/*
 * Write a program that calculates the number of buckets of paint to use for a room and 
 * the optimal number of cans to purchaseYou need to ask the height of the room and the length and width of the room.  
 * The room is rectangular. 
 *  You must paint the walls and the ceiling but not the floor.  There are no windows or skylights.  
 *  You can purchase the following size buckets of paint. 
 *  5-liter bucket costs $15 each and covers 1500 square feet. 
 *  1-liter bucket costs $4 and covers 300 square feet. */


public class Bucket {

	public static void main(String[] args) {
		Scanner  in  = new Scanner(System.in);
		double height, width, lenght;
		System.out.println("This program will determine the optimal amount"
				+ "of paint that should be purchased to paint your room.");
		System.out.println("what is the height of the room?");  	
		height = in.nextDouble(); 
		System.out.println("what is the width of the room?");  	
		width = in.nextDouble(); 
		System.out.println("what is the lenght of the room?");  	
		lenght = in.nextDouble(); 
		//			küljeseinad			otsaseinad			lagi
		double area = height * width * 2 + height * lenght * 2 + width * lenght;
		int fiveLiterBuckets = (int)(area/1500);
		double extraArea = area - fiveLiterBuckets * 1500;
		int oneLiterBuckets = (int) (area/300);
		oneLiterBuckets += (extraArea - oneLiterBuckets * 300 > 0)?1:0;
		if (oneLiterBuckets >= 4) {
			fiveLiterBuckets++;
			oneLiterBuckets =0;
		}
		System.out.println("You should buy " + fiveLiterBuckets+" five liter buckets at $15 each"); 
		System.out.println("You should buy " + oneLiterBuckets+" five liter buckets at $4 each"); 

	}

}
