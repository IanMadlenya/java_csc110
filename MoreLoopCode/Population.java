/*From the Book:
 *Program 9, page 243
 *
 *Write a program that will predict the size of a population of organisms. The program
 *should ask for the starting number of organisms, their average daily population increase
 *(as a percentage), and the number of days they will multiply.  For example, a population 
 *might begin with two organisms, have an average daily increase of 50 percent, and will be 
 *allowed to multiply for seven days. The program should use a loop to display the size of 
 *the population for each day. 
 *
 *Input Validation: 
 *Do not accept a number less than 2 for the starting size of the population
 *do not accept a negative number for the average daily population increase Do not accept
 *a number less than 1 for the number of days they will multiply. 
 *
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

 
public class Population
 	{
 		public static void main(String[] args)
 		{
 			
 				Scanner input = new Scanner(System.in);
 				DecimalFormat formatter = new DecimalFormat("###,###,###,###,###.00");
 				int startingNumberOfOrganism = 0, daysOverMultiplying = 0;
 				double averageDailyPopulationIncrease, dailyPopulation, percentIncrease;

 				//Ask for startingNumberOfOrganisms. 
 				//Validation: Don't accept numbers less than 2 organisms
 				
 				System.out.println("What is the starting number of organisms?");
 				startingNumberOfOrganism = input.nextInt();
 				
 				while(startingNumberOfOrganism < 2)
 				{
 					System.out.println("Invalid Input, enter number greater than 2");
 					System.out.println("What is the starting number of organisms?");
 					startingNumberOfOrganism = input.nextInt();
 					
 				}
 				
 				
 				//Ask for averageDailyPopulationIncrease
 				//Validation: Don't accept negative numbers
 				
 				System.out.println("What is the average daily population increase?(provide integer number, ie 50 for %50:");
 				averageDailyPopulationIncrease = input.nextInt();
 				
 				while(averageDailyPopulationIncrease < 2)
 				{
 					System.out.println("Invalid Input, enter an integer greater than one");
 					System.out.println("What is the average daily population increase?(provide decimal number, ie 50 for %50:");
 					averageDailyPopulationIncrease = input.nextDouble();
 				}
 				
 				
 				//Ask for daysOverMultiplying
 				//Validation: Don't accept less than 1
 				
 				System.out.println("Population Increase will occur over how many days?");
 				daysOverMultiplying = input.nextInt();
 				
 				while(daysOverMultiplying < 1)
 				{
 					System.out.println("Invalid Input, must enter at least a day!!");
 					System.out.println("Population Increase will occur over how many days??");
 					daysOverMultiplying = input.nextInt();
 				}
 				
 				
 				//loop to display the size of the 
 				//population for each day. 
 				
 				System.out.println("Here are the results:");
 				System.out.println("Days		Number Of Organism" );
 				System.out.println("------------------------------" );
 				
 				int day = 0;
 				
 				dailyPopulation = startingNumberOfOrganism;
 				percentIncrease = averageDailyPopulationIncrease/100;
 				
 				for(int x = 1; x <= daysOverMultiplying; x++)
 				{
 					day++;
 					if(day > 1)
 					{
 						dailyPopulation += (percentIncrease * dailyPopulation);
 						System.out.println(day + "             " + formatter.format(dailyPopulation));
 					}
 					else
 					{
 						System.out.println(day + "             " + formatter.format(dailyPopulation));
 					}
 					
 				}
 				
 				
 				
 		}

 }
 
 

  
  
  
 
 