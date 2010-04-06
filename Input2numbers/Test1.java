//Write a Java program that will input 2 double numbers. 
//Calculate and print the average of the 2 numbers

import javax.swing.JOptionPane;

public class Test1
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double number1, number2, average;
		
		System.out.println("enter a number");
		number1 = keyboard.nextDouble();
		
		System.out.println("enter the next number");
		number2 = keyboard.nextDouble();
		
		average = (number1 + number2)/2;
		System.out.println("the average is " + average);
	}
}