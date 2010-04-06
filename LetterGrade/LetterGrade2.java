/* Write a Java program that will input 2 grades. Calculate 
 * the average. Determine and print the letter grade. 
 * for example if the average is between 90 and 100 the letter grad is A; 
 * if the average is between 80 and 89
 *
 *This is a second way to write the program with only if statements
 *
 */

import java.util.Scanner;

public class LetterGrade2
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double numb1, numb2, average;
		
		System.out.println("Enter a number");
		numb1 = keyboard.nextDouble();
		
		System.out.println("Enter a second number");
		numb2 = keyboard.nextDouble();
		
		average = (numb1 + numb2) / 2;
		System.out.println("here is the average: " + average);
		
		if (average > 100)
			System.out.println("IMPROPER INPUT, your average is too high!");
		if (average >= 90 && average <=100)
			System.out.println("Your grade is a A");
		if (average >= 80 && average < 90 )
			System.out.println("Your grade is a B");
		if (average >= 70 && average < 80)
			System.out.println("Your grade is a C");
		if (average >= 60 && average < 70)
			System.out.println("Your grade is a D");
		if (average >= 0 && average <= 59)
			System.out.println("Your grade is an F");
					
	}	
	
}