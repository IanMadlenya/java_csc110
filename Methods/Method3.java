/* Write a java program that will input an integer
 * Call a method named "printMumber"....that will print the 
 * integer
 */
 
import java.util.Scanner;
 


public class Method3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x;
		System.out.println("Enter a number with a decimal point");
		x = input.nextDouble();
		printNumber(x);
	}
	
	public static void printNumber(double number)
	{
		double y = number * 2;
		System.out.println("The number is " + y);
	}
	
}