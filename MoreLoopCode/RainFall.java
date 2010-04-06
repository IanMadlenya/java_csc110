/* From the Book:
 * Write a program that uses nested loops to collect data and calculate the average rainfall 
 * over a period of years. First the program should ask for the number of years. The outer loop
 * will iterate once for each year. The inner loop will iterate 12 times, once for each month. 
 * Each iteration of the inner loop will ask the user for the inches of rainfall for that month. 
 * After all iterations, the program should display the number of months, the total inches of
 * rainfall, and the average rainfall per month for the entire period. 
 *
 * Input Validation: do not accept less than 1 for the number of years, do not accept negative
 * number for the monthly rainfall
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class RainFall
 	{
 		public static void main(String[] args)
 		{
 			int numberOfYears, numberOfMonths;
 			double totalInchesOfRainfall = 0; 
 			double averageRainfallPerMonth = 0; 
 			double accumulatedRainfall = 0; 
 			DecimalFormat formatter = new DecimalFormat("0.00");
 			
 			Scanner input = new Scanner(System.in);
 			System.out.println("Enter the number of years");
 			numberOfYears = input.nextInt();
 			
 			numberOfMonths = numberOfYears * 12;
 			
 			while(numberOfYears < 1) //Attempting Input Validation
 			{
 				System.out.println("Enter a value greater than one");
 				numberOfYears = input.nextInt();
 			}
 				
 			for(int year=1; year <= numberOfYears; year+=1)
 			{
 				int count = 0;
 				do
 				{
 					Scanner inputRainfall = new Scanner(System.in);
 					System.out.println("Enter the rainfall for this month:");
 					
 					totalInchesOfRainfall = inputRainfall.nextDouble();
 					
 					while(totalInchesOfRainfall < 0) //Attempting Input Validation
 					{
 						System.out.println("Negative numbers not allowed, try again!");
 						totalInchesOfRainfall = inputRainfall.nextDouble();
 					}
 					accumulatedRainfall += totalInchesOfRainfall;
 					
 					count++;
 					System.out.println("month: " + count + ", year: " + year);
 					
 					
 				}while(count < 12);
 				
 				System.out.println("Year: " + year + " entries complete!");
 				
 			}
 	
 			averageRainfallPerMonth = accumulatedRainfall/numberOfMonths;
 				
 			System.out.println("The number of Months: " + numberOfMonths);
 			System.out.println("The total inches of rainfall: " + accumulatedRainfall + " inches");
 			System.out.println("The average rainfall is: " + formatter.format(averageRainfallPerMonth) + " inches");
 				
 				
 		}
 
 }
 
 

  
  
  
 
 