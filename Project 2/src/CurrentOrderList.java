//Created by Tyler Yale
//Last modified 4/25/20

import java.util.ArrayList;

public class CurrentOrderList {
	//Aggregate class
	private ArrayList<Order> OrderList; // Create array list
	
	public CurrentOrderList() {
		OrderList = new ArrayList<Order>(); // instance array
	}
	
	public void AddOrder(Order NewOrder) {
		OrderList.add(NewOrder); // Add order to array list
	}
	
	public void DisplayOrders() {
		System.out.println("There are currently " + OrderList.size() + " orders." + "\n"); // Display # of orders
		
		for (Order Orders : OrderList)
	         System.out.println(Orders + "\n" + "-------------------"); // Display the orders in the array list
	}
	
}// End of CurrentOrderList class

