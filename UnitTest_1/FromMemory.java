/* write a program 
*/

import java.util.Scanner;

public class FromMemory
{
	public static void main(String [] args)
	{
		int packageAmount;
		double discountAmount;
		double costBeforeDiscount;
		double costAfterDiscount;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of packages");
		packageAmount = input.nextInt();
		costBeforeDiscount = packageAmount * 59;
		
		if(packageAmount < 4)
			System.out.println("No discount");
		else if(packageAmount >= 5 && packageAmount <= 20)
		{
			discountAmount = costBeforeDiscount * 0.1;
			costAfterDiscount = costBeforeDiscount - discountAmount;
			System.out.println("Discount Amount:" + discountAmount + "\nPackage Amount:" + packageAmount
							+"\nTotal Amount with Discount:" + costAfterDiscount);
		}
		else if(packageAmount >= 21 && packageAmount <= 30)
		{
			discountAmount = costBeforeDiscount * 0.2;
			costAfterDiscount = costBeforeDiscount - discountAmount;
			System.out.println("Discount Amount:" + discountAmount + "\nPackage Amount:" + packageAmount
							+"\nTotal Amount with Discount:" + costAfterDiscount);
		}
		else if(packageAmount >= 31 && packageAmount <= 40)
		{
			discountAmount = costBeforeDiscount * 0.3;
			costAfterDiscount = costBeforeDiscount - discountAmount;
			System.out.println("Discount Amount:" + discountAmount + "\nPackage Amount:" + packageAmount
							+"\nTotal Amount with Discount:" + costAfterDiscount);
			
		}
		else if(packageAmount >= 41 && packageAmount <= 50)
		{
			discountAmount = costBeforeDiscount * 0.4;
			costAfterDiscount = costBeforeDiscount - discountAmount;
			System.out.println("Discount Amount:" + discountAmount + "\nPackage Amount:" + packageAmount
							+"\nTotal Amount with Discount:" + costAfterDiscount);
		}
		else
		{
			discountAmount = costBeforeDiscount * 0.55;
			costAfterDiscount = costBeforeDiscount - discountAmount;
			System.out.println("Discount Amount:" + discountAmount + "\nPackage Amount:" + packageAmount
							+"\nTotal Amount with Discount:" + costAfterDiscount);
		}
	}
}