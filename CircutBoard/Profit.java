import java.util.Scanner;

public class Profit
{
	public static void main (String [] aaaaaa)
	{
		Scanner keyboard = new Scanner (System.in);
		double retailPrice, profit;
		
		System.out.println("Enter the retail price");
		retailPrice = keyboard.nextDouble();
		
		profit = retailPrice * 0.4;
		System.out.println("The profit is " + profit);
		
	}	
	
}