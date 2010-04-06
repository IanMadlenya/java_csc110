/* Write a Java program that will input 2 grades. Calculate 
 * the average. Determine and print the letter grade. 
 * for example if the average is between 90 and 100 the letter grad is A; 
 * if the average is between 80 and 89
 */


import java.util.Scanner;

public class LetterGrade
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
		else if (average >= 90 && average <=100)
		{		
			if (average == 100)
				System.out.println("Your HONORS!");
			else		
			System.out.println("Your grade is an A");
		}
		else if (average >= 80 && average < 90 )
			System.out.println("Your grade is a B");
		else if (average >= 70 && average < 80)
			System.out.println("Your grade is a C");
		else if (average >= 60 && average < 70)
			System.out.println("Your grade is a D");
		else
			System.out.println("Your grade is an F");
					
	}	
	
}