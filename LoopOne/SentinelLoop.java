/* Write a java program that will repeatedly prompt you to input a sales
 * amount. Calculate and print the tax amount (multiple the sales amount by 8%). 
 * stop the repetition by entering a sentinel sales amount equal to -1.
 */
 
 

import java.util.Scanner;

public class SentinelLoop
{
	public static void main(String [] arg)
	{
		Scanner input = new Scanner(System.in);
	
		double salesAmount, taxAmount;
		int count = 0;
		
		System.out.println("What is the sales amount");
		salesAmount = input.nextDouble();
		
		
		while( salesAmount != -1) //the -1 is considered a sentinel value
		{
			count++;
			taxAmount = salesAmount * 0.08;
			System.out.println("Your tax is $" + taxAmount);
			System.out.println("Enter another sales amount");
			salesAmount = input.nextDouble();	
		}
		System.out.println("Number of sales: " + count);
	}	
	
}