// Write a Java program that will input an integer.
// Print the number.

import java.util.Scanner;

public class Input1
{
	public static void main(String [] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		//int numb;
		double number;
		
		System.out.println("Enter a number");
		//numb = keyboard.nextInt();
		numb = keyboard.nextDouble();
		System.out.println("You entered " + numb);
	}	
	
}