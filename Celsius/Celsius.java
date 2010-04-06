/* Write a Java program that will repeatedly prompt you
 * to  input a number that represents the temperature
 * in Fahrenheit. Calculate and print the temperature
 * in Celsius. 
 *
 * Celsius = (Fahrenheit - 32) * 5/9
 *
 * Stop the repetition by entering a temperature equal 
 * to -9999. 
 *
 */
 
 
 

import java.util.Scanner;
import java.text.DecimalFormat;

public class Celsius
{
	public static void main(String [] arg)
	{
		Scanner input = new Scanner(System.in);
	
		double tempFahrenheit, tempCelsius;
		DecimalFormat formatObject = new DecimalFormat("##0.00");
		
		System.out.println("What is the temperature in Fahrenheit");
		tempFahrenheit = input.nextDouble();
		
		
		while( tempFahrenheit != -9999) //the -9999 is considered a sentinel value
		{
			tempCelsius = (tempFahrenheit - 32) * 5/9;
			System.out.println("Celsius is:" + formatObject.format(tempCelsius));
			System.out.println("Enter another temperature in Fahrenheit");
			tempFahrenheit = input.nextDouble();	
		}
	}	
	
}