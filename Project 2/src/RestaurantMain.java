//This program is a restaurant order and inventory menu.
//Created by Tyler Yale
//Last modified 4/25/20

import java.io.*;
import java.util.Scanner;

enum FoodType { PASTA, PIZZA, SOUPS, SALADS, DESSERTS }

public class RestaurantMain {
	// Start of main method
	public static void main(String[] args) throws IOException {
		
		//Init variables
		
		String Option;
		boolean RunAgain = true,
				CanOrder;
		int OrderNumber = 0;
		
		// Create new instance of objects
		Scanner GetInput = new Scanner(System.in);
		
		CurrentOrderList OrderList = new CurrentOrderList();
		
		Inventory Inv = new Inventory();
		
		PastOrders PastOrder = new PastOrders();
		
		while(RunAgain)
		{
			System.out.println("Welcome to Tony's Classic Italian Cuisine!" + "\n"
			           + "Please choose an option" + "\n"
			           + "1: Place an order." + "\n"
			           + "2: Check current orders." + "\n"
			           + "3: Check past orders." + "\n"
			           + "4: Check inventory." + "\n"
					   + "5: Quit.");
			
			// Set option to what user writes
			Option = GetInput.nextLine();
						// Validate option
			while (!Option.equals("1") && !Option.equals("2") && !Option.equals("3") && !Option.equals("4") && !Option.equals("5"))
			{
			
				System.out.println("Please enter a valid option between 1, 2, 3, 4, and 5");
							
				Option = GetInput.nextLine();
			}// End of While loop for option validation
			
			if (Option.equals("1"))
			{
				System.out.println("Please choose an option" + "\n"
								 + "1. " + FoodType.PASTA + "\n"
							     + "2. " + FoodType.PIZZA + "\n"
								 + "3. " + FoodType.SOUPS + "\n"
							     + "4. " + FoodType.SALADS + "\n"
								 + "5. " + FoodType.DESSERTS);
				
				Option = GetInput.nextLine();
				// Validate option
				
				while (!Option.equals("1") && !Option.equals("2") && !Option.equals("3") && !Option.equals("4") && !Option.equals("5"))
				{
				
					System.out.println("Please enter a valid option between 1, 2, 3, 4, and 5");
								
					Option = GetInput.nextLine();
				}// End of While loop for option validation
				
				if (Option.equals("1"))
				{
					System.out.println("Please choose a pasta from the menu." + "\n"
									 + "1. Classic Spaghetti and Meatballs -- $8.75" + "\n"
									 + "2. Penne Puttanesca -- $10.75" + "\n"
									 + "3. Chicken Alfredo -- $9.99" + "\n"
									 + "4. Four Cheese Ravioli -- 10.29");
					
					Option = GetInput.nextLine();
					// Validate option
					
					while (!Option.equals("1") && !Option.equals("2") && !Option.equals("3") && !Option.equals("4"))
					{
					
						System.out.println("Please enter a valid option between 1, 2, 3, and 4");
									
						Option = GetInput.nextLine();
					}// End of While loop for option validation
					
					if (Option.equals("1"))
					{
						
						CanOrder = Inv.UpdateInventory("Spaghetti and Meatballs");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.PASTA, "Spaghetti and Meatballs", OrderNumber += 1, 8.75);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
						
					}
					
					if (Option.equals("2"))
					{
						CanOrder = Inv.UpdateInventory("Penne Puttanesca");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.PASTA, "Penne Puttanesca", OrderNumber += 1, 10.75);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("3"))
					{
						CanOrder = Inv.UpdateInventory("Chicken Alfredo");
						
						if (CanOrder)
						{
						
							Order NewOrder = new Order(FoodType.PASTA, "Chicken Alfredo", OrderNumber += 1, 9.99);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("4"))
					{
						CanOrder = Inv.UpdateInventory("Four Cheese Ravioli");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.PASTA, "Four Cheese Ravioli", OrderNumber += 1, 10.29);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					Option = "";
				}// End of if options for Pasta
				
				if (Option.equals("2"))
				{
					System.out.println("Please choose a pizza from the menu." + "\n"
									 + "1. Margherita -- $10.75" + "\n"
									 + "2. Pepperoni -- $9.89" + "\n"
									 + "3. Tony's Meat Special -- $11.75");
					
					Option = GetInput.nextLine();
					// Validate option
					
					while (!Option.equals("1") && !Option.equals("2") && !Option.equals("3"))
					{
					
						System.out.println("Please enter a valid option between 1, 2, and 3");
									
						Option = GetInput.nextLine();
					}// End of While loop for option validation
					
					if (Option.equals("1"))
					{
						CanOrder = Inv.UpdateInventory("Margherita");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.PIZZA, "Margherita", OrderNumber += 1, 10.75);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("2"))
					{
						CanOrder = Inv.UpdateInventory("Pepperoni");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.PIZZA, "Pepperoni", OrderNumber += 1, 9.89);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("3"))
					{
						CanOrder = Inv.UpdateInventory("Tony's Meat Special");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.PIZZA, "Tony's Meat Special", OrderNumber += 1, 11.75);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					Option = "";
				}// End of if option for Pizza
				
				if (Option.equals("3"))
				{
					System.out.println("Please choose a soup from the menu." + "\n"
									 + "1. Minestrone -- $5.75" + "\n"
									 + "2. Tomato Basil -- $5.75" + "\n"
									 + "3. Soup Di Giorno -- $4.99");
					
					Option = GetInput.nextLine();
					// Validate option
					
					while (!Option.equals("1") && !Option.equals("2") && !Option.equals("3"))
					{
					
						System.out.println("Please enter a valid option between 1, 2, and 3");
									
						Option = GetInput.nextLine();
					}// End of While loop for option validation
					
					if (Option.equals("1"))
					{
						CanOrder = Inv.UpdateInventory("Minestrone");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.SOUPS, "Minestrone", OrderNumber += 1, 5.75);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("2"))
					{
						CanOrder = Inv.UpdateInventory("Tomato Basil");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.SOUPS, "Tomato Basil", OrderNumber += 1, 5.75);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("3"))
					{
						CanOrder = Inv.UpdateInventory("Soup Di Giorno");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.SOUPS, "Soup Di Giorno", OrderNumber += 1, 4.99);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					Option = "";
				}// End of if option for Soups
				
				if (Option.equals("4"))
				{
					System.out.println("Please choose a salad from the menu." + "\n"
									 + "1. House Salad -- $3.99" + "\n"
									 + "2. Caesar Salad -- $4.00" + "\n"
									 + "3. Wedge Salad -- $2.99");
					
					Option = GetInput.nextLine();
					// Validate option
					
					while (!Option.equals("1") && !Option.equals("2") && !Option.equals("3"))
					{
					
						System.out.println("Please enter a valid option between 1, 2, and 3");
									
						Option = GetInput.nextLine();
					}// End of While loop for option validation
					
					if (Option.equals("1"))
					{
						CanOrder = Inv.UpdateInventory("House Salad");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.SALADS, "House Salad", OrderNumber += 1, 3.99);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("2"))
					{
						CanOrder = Inv.UpdateInventory("Caesar Salad");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.SALADS, "Caesar Salad", OrderNumber += 1, 4.00);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("3"))
					{
						CanOrder = Inv.UpdateInventory("Wedge Salad");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.SALADS, "Wedge Salad", OrderNumber += 1, 2.99);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					Option = "";
				}// End of if option for Salads
				
				if (Option.equals("5"))
				{
					System.out.println("Please choose a dessert from the menu." + "\n"
									 + "1. Cannoli -- $3.50" + "\n"
									 + "2. Tiramisu -- $5.95" + "\n"
									 + "3. Cheesecake -- $4.95");
					
					Option = GetInput.nextLine();
					// Validate option
					
					while (!Option.equals("1") && !Option.equals("2") && !Option.equals("3"))
					{
					
						System.out.println("Please enter a valid option between 1, 2, and 3");
									
						Option = GetInput.nextLine();
					}// End of While loop for option validation

					if (Option.equals("1"))
					{
						CanOrder = Inv.UpdateInventory("Cannoli");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.DESSERTS, "Cannoli", OrderNumber += 1, 3.50);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("2"))
					{
						CanOrder = Inv.UpdateInventory("Tiramisu");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.DESSERTS, "Tiramisu", OrderNumber += 1, 5.95);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					if (Option.equals("3"))
					{
						CanOrder = Inv.UpdateInventory("Cheesecake");
						
						if (CanOrder)
						{
							Order NewOrder = new Order(FoodType.DESSERTS, "Cheesecake", OrderNumber += 1, 4.95);
							
							OrderList.AddOrder(NewOrder);
							
							PastOrder.AddOrder(NewOrder);
							
							System.out.println("Thank you for placing an order with us!");
							
							Option = "";
						}
					}
					
					Option = "";
				}// End of if option for Desserts
				
			}// End of if option for Place Orders
			
			if (Option.equals("2"))
			{
				OrderList.DisplayOrders();
				
				Option = "";
			}//End of if for Check Current Orders option
			
			if (Option.equals("3"))
			{
				PastOrder.DisplayPastOrders();
				
				Option = "";
			}
			
			if (Option.equals("4"))
			{
				Inv.DisplayInventory();
				
				Option = "";
			}
			
			if (Option.equals("5"))
			{
				GetInput.close();
				RunAgain = false;
			}
		}// End of While loop for main program

	}// End of Main method

}// End of Class
