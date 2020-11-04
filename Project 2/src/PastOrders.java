//Created by Tyler Yale
//Last modified 4/25/20

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PastOrders {
	
	public void AddOrder(Order NewOrder) throws IOException {
		PrintWriter PastOrdersFile = new PrintWriter(new FileWriter("Past_Orders.txt", true));
		
		PastOrdersFile.print(NewOrder + "\n");
		
		PastOrdersFile.close();
	}// end of AddOrder method
	
	public void DisplayPastOrders() throws IOException {
		File file = new File("Past_Orders.txt"); // Open file
		
		Scanner ReadFile = new Scanner(file); // New scanner object for file
		
		System.out.println("\n" + "The past orders that have been placed are: " + "\n");
		
		while (ReadFile.hasNext())
		{
			String FoodTypeLine = ReadFile.nextLine(); // Read first line
			
			String MenuItemLine = ReadFile.nextLine(); // Read next line
			
			String OrderNumberLine = ReadFile.nextLine(); // Read next line
			
			String AmountLine = ReadFile.nextLine(); // Read next line
			
			System.out.println(FoodTypeLine + "\n"
							 + MenuItemLine + "\n"
							 + OrderNumberLine + "\n"
							 + AmountLine + "\n");
			
		}
	ReadFile.close();
	}
}

