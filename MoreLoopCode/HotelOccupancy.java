/*From the Book:
 *Program 7, page 243
 *
 *A hotel's occupancy rate is calculated as follows:
 *
 *	Occupancy rate = number of rooms occupied / total number of rooms
 *
 *Write a program that calculates the occupancy rate for each floor of a hotel. The program
 *should start by asking for the number of floors in the hotel. A loop should then iterate once
 *for each floor. During each iteration, the loop should ask the user for the number of rooms
 *on the floor and the number of them that are occupied. After all the iterations, the program 
 *should display the number of rooms the hotel has, the number of them that are occupied, the 
 *number that are vacant, and the occupancy rate for the hotel. 
 *
 *Input Validation: 
 *Do not accept a value less than 1 for the number of floors. Do not accept 
 *a number less than 10 for the number of rooms on a floor. 
 *
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;
//import javax.swing.JOptionPane;

 
public class HotelOccupancy
 	{
 		public static void main(String[] args)
 		{
 			DecimalFormat formatter = new DecimalFormat("#.000");
 			Scanner input = new Scanner(System.in);
 			int numberOfFloors, roomsPerFloor, roomsOccupied;
 			int vacancies = 0, totalRoomsOccupied = 0, totalRooms = 0;
 			double occupancyRate = 0;
 			
 			
 			//Ask for the number of floors in the hotel: numberOfFloors
 			//Number of floor mustn't be less than one. 
 			
 			System.out.println("How many floors in this hotel?");
 			numberOfFloors = input.nextInt();
 			
 			while(numberOfFloors < 1)
 			{
 				System.out.println("Invalid floor number, try again");
 				numberOfFloors = input.nextInt();
 			}
 			
 			int floorCount = 0;
 			
 			for(int x = 1; x <= numberOfFloors; x++ )	
 			{
 				//Iterate per floor
 				//Ask for the number of rooms on the floor: roomsPerFloor
 				
 				floorCount++;
 				
 				System.out.println("Floor:" + floorCount);
 				System.out.println("How many rooms on this floor");
 				roomsPerFloor = input.nextInt();
 				
 				//Make sure number of room is not less than 10
 				
 				while(roomsPerFloor < 10)
 				{	
 					System.out.println("Invalid Input, 10 or greater rooms per floor");
 					System.out.println("How many rooms on this floor");
 					roomsPerFloor = input.nextInt();
 				}
 				//Ask for the number of rooms occupied: roomsOccupied
 				
 				System.out.println("How many rooms are occupied on this floor?");
 				roomsOccupied = input.nextInt();
 				totalRooms += roomsPerFloor;
 				totalRoomsOccupied += roomsOccupied;
 				vacancies = totalRooms - totalRoomsOccupied;
 				occupancyRate = totalRoomsOccupied/(double)(totalRooms);
 				
 			}
 			
 			//Display the following
 			//The total number of rooms the hotal has
 			System.out.println("Total Hotel Rooms: " + totalRooms);
			//The total number of room occupied
			System.out.println("Rooms Occupied: " + totalRoomsOccupied);
 			//The total number that are vacant
 			System.out.println("Rooms Available: " + vacancies);
 			//The occupancy rate for the entire hotel
 			System.out.println("Occupancy Rate: " + formatter.format(occupancyRate));
		
 		}
 
 }
 

  
  
  
 
 