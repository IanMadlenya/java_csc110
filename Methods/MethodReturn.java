/* Write a Java program that will input a double number. 
 * Call a method named "doubleIt" that will recieve the 
 * number as a parameter. "double it will double the nubmer 
 * and return it to the main method.The main method will 
 * then print the double.
 */
 
 
import java.util.Scanner;
 


public class MethodReturn
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x;
		double theDouble;
		System.out.println("Enter a number with a decimal point");
		x = input.nextDouble();
		theDouble = doubleIt(x);
		
		System.out.println("The number is " + theDouble);
	}
	
	public static double doubleIt(double number)
	{
		double y = number * 2;
		return y;
	}
	
}