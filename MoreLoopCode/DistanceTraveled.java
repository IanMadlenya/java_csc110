/*From the Book
 *Program 2, page 242
 *
 *The Distance a vehicle travels can be calculated as follows:
 *
 *Distance = Speed * Time
 *
 *For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
 *120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the 
 *number of hours it has traveled. It hould use a loop to  display the distance a vehicle has
 *traveled for each hour of a time period specified by the user. For example, if a vehicle is 
 *traveling at 40 mps for a three hour time period, it should display a report similar to the
 *one that follows: 
 *
 *		Hour				DistanceTraveled
 *		------------------------------------
 *		1					40
 *		2					80
 *		3					120
 *
 *Input Validation: Do not accept a negative number for speed and do not accept any value less
 *than 1 for time traveled. 
 *
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

 
public class DistanceTraveled
 	{
 		public static void main(String[] args)
 		{
 			int timeElapsed, hour;
 			double speed, distanceTraveled;
 			Scanner input = new Scanner(System.in);
 			
 			//Ask for the speed of the Vehicle
 			System.out.println("What is the vehicles speed?");
 			speed = input.nextDouble();
 			
 			while(speed < 0)
 			{
 				System.out.println("Invalid entry, integer must be greater than 0");
 				speed = input.nextDouble();
 			}
 				
 			//Ask for the number of hours
 			System.out.println("How many hours?");
 			timeElapsed = input.nextInt();
 			
 			while(timeElapsed < 1)
 			{
 				System.out.println("Invalid entry, integer must be greater than 0");
 				timeElapsed = input.nextInt();
 			}
 			
 			//Provide a table showing totalDistanceTraveled
 			
 			System.out.println("Hour         Distance Traveled (miles)");
 			System.out.println("------------------------------------");
 			
 			hour = 0;
 			
 			for(int x = 1; x <= timeElapsed; x++)
 			{
 				hour++;
 				if(hour > 1)
 				{
 					distanceTraveled = hour * speed;
 					System.out.println(hour + "              " + distanceTraveled);
 				}
 				else
 				{
 					System.out.println(hour + "              " + speed);
 				}
 			}		
 		}
 
 }
 
 

  
  
  
 
 