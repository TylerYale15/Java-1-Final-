//Created by Tyler Yale
//Last modified 4/25/20

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Inventory {
	// Set fields 
	private boolean CanOrder;
	private HashMap<String, Integer> InventoryMap; // Create hashmap
	
	public Inventory() throws IOException
	{
		InventoryMap = new HashMap<String, Integer>();
		
		File file = new File("Inventory.txt"); // Open file
		
		Scanner ReadFile = new Scanner(file); // New scanner object for file
		
		while (ReadFile.hasNext())
		{
			String FoodLine = ReadFile.nextLine(); // Read first line
			
			String AmountLine = ReadFile.nextLine(); // Read next line
			
			int Amount = Integer.parseInt(AmountLine);	
			
			InventoryMap.put(FoodLine, Amount);
		}
	ReadFile.close();
	}// End of constructor
	
	
	public boolean UpdateInventory(String MenuItem) throws IOException
	{
		if (MenuItem.equals("Spaghetti and Meatballs")) // Check for type of food
		{
			if (InventoryMap.get("Spaghetti and Meatballs") == 0) // Check if hashmap value is 0
			{
				System.out.println("Sorry the item you're trying to order is out of stock."); // Display to user
				
				CanOrder = false; // set can order to false 
			} else 
			{
				int Amount = InventoryMap.get("Spaghetti and Meatballs");
				InventoryMap.put("Spaghetti and Meatballs", Amount -= 1); // Subtract one from inventory
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Penne Puttanesca"))
		{
			if (InventoryMap.get("Penne Puttanesca") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Penne Puttanesca");
				InventoryMap.put("Penne Puttanesca", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Chicken Alfredo"))
		{
			if (InventoryMap.get("Chicken Alfredo") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Chicken Alfredo");
				InventoryMap.put("Chicken Alfredo", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Four Cheese Ravioli"))
		{
			if (InventoryMap.get("Four Cheese Ravioli") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Four Cheese Ravioli");
				InventoryMap.put("Four Cheese Ravioli", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Margherita"))
		{
			if (InventoryMap.get("Margherita") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Margherita");
				InventoryMap.put("Margherita", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Pepperoni"))
		{
			if (InventoryMap.get("Pepperoni") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Pepperoni");
				InventoryMap.put("Pepperoni", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Tony's Meat Special"))
		{
			if (InventoryMap.get("Tony's Meat Special") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Tony's Meat Special");
				InventoryMap.put("Tony's Meat Special", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Minestrone"))
		{
			if (InventoryMap.get("Minestrone") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Minestrone");
				InventoryMap.put("Minestrone", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Tomato Basil"))
		{
			if (InventoryMap.get("Tomato Basil") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Tomato Basil");
				InventoryMap.put("Tomato Basil", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Soup Di Giorno"))
		{
			if (InventoryMap.get("Soup Di Giorno") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Soup Di Giorno");
				InventoryMap.put("Soup Di Giorno", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("House Salad"))
		{
			if (InventoryMap.get("House Salad") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("House Salad");
				InventoryMap.put("House Salad", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Caesar Salad"))
		{
			if (InventoryMap.get("Caesar Salad") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Caesar Salad");
				InventoryMap.put("Caesar Salad", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Wedge Salad"))
		{
			if (InventoryMap.get("Wedge Salad") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Wedge Salad");
				InventoryMap.put("Wedge Salad", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Cannoli"))
		{
			if (InventoryMap.get("Cannoli") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Cannoli");
				InventoryMap.put("Cannoli", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Tiramisu"))
		{
			if (InventoryMap.get("Tiramisu") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Tiramisu");
				InventoryMap.put("Tiramisu", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		if (MenuItem.equals("Cheesecake"))
		{
			if (InventoryMap.get("Cheesecake") == 0)
			{
				System.out.println("Sorry the item you're trying to order is out of stock.");
				
				CanOrder = false;
			} else 
			{
				int Amount = InventoryMap.get("Cheesecake");
				InventoryMap.put("Cheesecake", Amount -= 1);
				
				CanOrder = true;
			}
		}
		
		PrintWriter InvFile = new PrintWriter(new FileWriter("Inventory.txt")); // instance print write for file
		
		for (Map.Entry mapElement : InventoryMap.entrySet()) {  // iterate through hashmap
            String key = (String)mapElement.getKey(); // set variable for the key 
            
            int value = ((int)mapElement.getValue()); // set variable for the int
            
            InvFile.println(key + "\n" + value); // print to file
		}
		
	InvFile.close();
	return CanOrder;
	}
	
	public void DisplayInventory()
	{
		for (Map.Entry mapElement : InventoryMap.entrySet()) { 
            String key = (String)mapElement.getKey();
            
            int value = ((int)mapElement.getValue());
            
            System.out.println(key + " : " + value);
		}
	}
}
