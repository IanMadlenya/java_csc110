/*An Internet service provider has three different subscription 
 *packages for its customers: 
 *
 *Package A: For $9.95 per month 10 hour of access are provided. 
 *Additional hours are $2.00 per hour. 
 *Package B: For $13.95 per month 20 hour of access are provided. 
 *Additional hours are $1.00 per hour. 
 *Package C: For $19.95 per month unlimited access is provided. 
 *
 *Write a program that calculates a customers's monthly bill. It 
 *should ask the user to enter the letter of the package the 
 *customer has purchased (A,B or C) and the number of hours that 
 *were used. It should then display the total charges. 
 */
 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InternetServiceProvider
{
	public static void main (String [] args)
	{
		
		String input1, input2; 
		double hours;
		double additionalHours;
		double packageA = 9.95;
		double packageB = 13.93;
		double packageC = 19.95;
		
		double packageAAdditionalCharge = 2.00;
		double packageBAdditionalCharge = 1.00;
		
		int hoursPackageA = 10;
		int hoursPackageB = 20;
		
		double totalCharge;
		
		input1 = JOptionPane.showInputDialog("What package was purchased..A..B..or..C?");
		
		if (input1.equalsIgnoreCase("C"))
		{
			JOptionPane.showMessageDialog(null, "Your total charge is: $" + packageC);
		}
		else 
		{
			input2 = JOptionPane.showInputDialog("How many hours were used?");
			hours = Double.parseDouble(input2);
		
			if (input1.equalsIgnoreCase("A"))
			{
				if(hours < hoursPackageA)
				{
				JOptionPane.showMessageDialog(null, "Your total charge is: $" + packageA);	
				}		
				else //calculate for overuse
				{
				additionalHours = hours - hoursPackageA;
				totalCharge = packageA + (additionalHours * packageAAdditionalCharge);
				JOptionPane.showMessageDialog(null, "Your total charge is: $" + totalCharge);
				}	
			}
			else if (input1.equalsIgnoreCase("B"))
			{
				if(hours < hoursPackageB)
				{
				JOptionPane.showMessageDialog(null, "Your total charge is: $" + packageB);	
				}		
				else //calculate for overuse
				{
				additionalHours = hours - hoursPackageB;
				totalCharge = packageB + (additionalHours * packageBAdditionalCharge);
				JOptionPane.showMessageDialog(null, "Your total charge is: $" + totalCharge);
				}
			}			
		}	
	}
}