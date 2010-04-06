/* write a program 
*/

import java.util.Scanner;

public class FromMemory2
{
	public static void main(String [] args)
	{
		int pA; //package amount
		double dA; //discount amount
		double cBD; //cost before discount
		double cAD; //cost after discount
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of packages");
		pA = input.nextInt();
		cBD = pA * 59;
		
		if(pA < 4)
			System.out.println("No discount");
		else if(pA >= 5 && pA <= 20)
		{
			dA = cBD * 0.1;
			cAD = cBD - dA;
			System.out.println("Discount Amount:" + dA + "\nPackage Amount:" + pA
							+"\nTotal Amount with Discount:" + cAD);
		}
		else if(pA >= 21 && pA <= 30)
		{
			dA = cBD * 0.2;
			cAD = cBD - dA;
			System.out.println("Discount Amount:" + dA + "\nPackage Amount:" + pA
							+"\nTotal Amount with Discount:" + cAD);
		}
		else if(pA >= 31 && pA <= 40)
		{
			dA = cBD * 0.3;
			cAD = cBD - dA;
			System.out.println("Discount Amount:" + dA + "\nPackage Amount:" + pA
							+"\nTotal Amount with Discount:" + cAD);
			
		}
		else if(pA >= 41 && pA <= 50)
		{
			dA = cBD * 0.4;
			cAD = cBD - dA;
			System.out.println("Discount Amount:" + dA + "\nPackage Amount:" + pA
							+"\nTotal Amount with Discount:" + cAD);
		}
		else
		{
			dA = cBD * 0.55;
			cAD = cBD - dA;
			System.out.println("Discount Amount:" + dA + "\nPackage Amount:" + pA
							+"\nTotal Amount with Discount:" + cAD);
		}
	}
}