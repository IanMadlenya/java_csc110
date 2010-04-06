/* A car's mile-per-gallon (MPG) can be calculated with the following formula:
 * MPG = Miles driven / Gallons of gas used
 * Write a program that asks the user for the number of miles driven 
 * and the gallons of gas used. It should calculate the car's 
 * miles-per-gallon and display the result on the screen
 */
 
 import java.util.Scanner;
 import javax.swing.JOptionPane;
 
 
 public class MilesPerGallon
 {
 	public static void main(String [] args)
 	{
 		String input1;
 		String input2;
 		double milesDriven;
 		double gallonsUsed;
 		double milesPerGallon;
 		
 		input1 = JOptionPane.showInputDialog("How many miles did you drive?");
 		input2 = JOptionPane.showInputDialog("How many gallons of gas did you use?");
 		
 		milesDriven = Double.parseDouble(input1);
 		gallonsUsed = Double.parseDouble(input2);
 		milesPerGallon = milesDriven/gallonsUsed;
 		
 		JOptionPane.showMessageDialog(null, "Your miles per gallon is: " + milesPerGallon );
 		
 	}
 }