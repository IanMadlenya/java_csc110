/* Write a program that asks the user to enter an item's 
 * wholesale cost and its markup percentage. It should be
 * then display the item's retail price. For example:
 *
 *	if an item's wholesale cost is 5.00 and its markup 
 *	percentage is 100 percent, the the items's retail price is 10.00.
 * 
 *	if an item's wholesale cost is 5.00 and its markup percentage 
 *	50 pecent, then the item's retail price is 7.50.
 *
 * The program should have a method named calculateRetail that 
 * receives the wholesale cost and the markup percentage as 
 * arguments, and returns the retail price of the item. 
 *
 */
 
 import java.util.Scanner;
 
 
 public class RetailPriceCalculator
 {
 	public static void main(String[] args)
 	{
 		Scanner input = new Scanner(System.in);
 		double wholeSaleCost;
 		double markUpPercentage;
 		double retailPrice;
 		
 		System.out.println("Enter the wholesale cost");
 		wholeSaleCost = input.nextDouble();
 		
 		System.out.println("Enter the markup percentage");
 		markUpPercentage = input.nextDouble();
 		
 		retailPrice = calculateRetail(wholeSaleCost, markUpPercentage);
 		System.out.println("The retail price is: " + retailPrice);
 		
 		
 	}
 	
 	public static double calculateRetail(double wholesale, double markUp)
 	{
 		double markUpConverted = markUp/100;
 		double markUpAmount = wholesale * markUpConverted;
 		double retail = wholesale + markUpAmount;
 		return retail;
 	}

 }