/* Write a program that asks the user to enter a number of seconds
 * 
 * There are 60 seconds in a minute. If the number of seconds entered by the user is greater
 * than or equal to 60, the program should display the number of minutes in that many seconds
 *
 * There are 3600 seconds in an hour. If the number of seconds entered by the user is greater
 * than or equal to 3600, the program should display the number of hours in that many seconds
 *
 * There are 86400 seconds in a day If the number of seconds entered by the user is greater
 * than or equal to 86400, the program should display the number of days in that many seconds
 */

//import java.util.Scanner;
import javax.swing.JOptionPane;
 
 public class TimeCalculator
 {
   public static void main(String [] args)
   {
     
     //variable declarations
     
     String input;
     double seconds, minutesCalculated, hoursCalculated, daysCalculated;
     final double secondsPerMinute = 60;
     final double secondsPerHour = 3600;
     final double secondsPerDay = 86400;
     
     input = JOptionPane.showInputDialog("Enter the seconds:");
     seconds = Double.parseDouble(input); 
     
     if (seconds < secondsPerMinute)
     {
       JOptionPane.showMessageDialog(null, seconds + " seconds (no conversion was made)");
     }
     
     else if (seconds >= secondsPerMinute && seconds < secondsPerHour )
     {
       minutesCalculated = seconds/secondsPerMinute;
       JOptionPane.showMessageDialog(null, seconds + " seconds equals: " + minutesCalculated + " minutes");
     }
     
     else if (seconds >= secondsPerHour && seconds < secondsPerDay)
     {
       hoursCalculated = seconds/secondsPerHour;
       JOptionPane.showMessageDialog(null, seconds + " seconds equals: " + hoursCalculated + " hours");
     }
     
     else if (seconds >= secondsPerDay)
     {
       daysCalculated = seconds/secondsPerDay;
       JOptionPane.showMessageDialog(null, seconds + " seconds equals: " + daysCalculated + " days");
     }
     
   }
 }
 

 
