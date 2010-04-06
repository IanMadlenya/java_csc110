//Write a Java program that will input 2 double numbers. 
//Calculate and print the average of the 2 numbers

//Check blackboard for the assignment: there are (4) of them. 

import java.util.Scanner;

public class Input3numbers
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double number1, number2, number3, average;
		String name; 
		
		System.out.println("enter your name");
		name = keyboard.nextLine();
		
		System.out.println("enter a number");
		number1 = keyboard.nextDouble();
		
		System.out.println("enter the next number");
		number2 = keyboard.nextDouble();
		
		System.out.println("enter the next number");
		number3 = keyboard.nextDouble();
		
		average = (number1 + number2 + number3)/3;
		System.out.println(name + ", your average is " + average);
	}
}