/* The following table shows the approximate speed of sound in air, water, and steel: 
 * 
 * 			Medium				Speed
 * 			Air					1100 feet per second
 * 			Water				4900 feet per second
 * 			Steel				16,400 feet per second
 * 
 * Write a program that asks the user to enter "air", "water", or "steel", 
 * and the distance that a sound wave will travel in the medium. The program 
 * should then display the amount of time it will take.  
 * 
 * You can calculate the amount of time it takes sound to travel in air with the following formula: 
 * 
 * 		Time = distance /1100
 * 
 * You can calculate the amount of time it takes sound to travel in water with the following formula:
 * 
 * 		Time = distance /4900
 * 
 * you can calculate the amount of time it takes sound to travel in steel with the following formula: 
 * 
 * 		Time = distance / 16400
 */

 import javax.swing.JOptionPane;
 import java.text.DecimalFormat;
 
 public class SpeedOfSound
 {
   public static void main(String [] args)
   {
	   String medium,input;
	   double feetPerSecondInAir = 1100;
	   double feetPerSecondInWater = 4900;
	   double feetPerSecondInSteel = 16400;
	   double distanceTraveled, timeInSeconds;
	   medium = JOptionPane.showInputDialog("Please enter the medium \nsound will travel in (air, water or steel)....");
	   input = JOptionPane.showInputDialog("Please enter the distance \nit will travel....");
	   distanceTraveled = Double.parseDouble(input);
	   
	   DecimalFormat formatter = new DecimalFormat("#0.000");
	   
	   
	   if (medium.equalsIgnoreCase("air"))
	   {	
		   timeInSeconds = distanceTraveled/feetPerSecondInAir;
		   String formattedTimeInSeconds = formatter.format(timeInSeconds);
		   JOptionPane.showMessageDialog(null, "It will take " + formattedTimeInSeconds + " seconds");
		   
	   }
	   
	   else if (medium.equalsIgnoreCase("water"))
	   {
		   timeInSeconds = distanceTraveled/feetPerSecondInWater;
		   String formattedTimeInSeconds = formatter.format(timeInSeconds);
		   JOptionPane.showMessageDialog(null, "It will take " + formattedTimeInSeconds + " seconds");
				   
		 }
	   
	   else if (medium.equalsIgnoreCase("steel"))
	   {
		   timeInSeconds = distanceTraveled/feetPerSecondInSteel;
		   String formattedTimeInSeconds = formatter.format(timeInSeconds);
		   JOptionPane.showMessageDialog(null, "It will take " + formattedTimeInSeconds + " seconds");
	   }
	   
	   else
	   {
		   JOptionPane.showMessageDialog(null, "You did not enter either water, air or steel, \n" +
		   															"what's your problem?");
	   }
	   
	   
   }
   
 }