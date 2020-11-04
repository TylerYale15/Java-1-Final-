//Created by Tyler Yale
//Last modified 4/25/20

public class Order {
	
	private FoodType Food;
	private String MenuItem;
	private int OrderNumber;
	private double OrderPrice;
	
	public Order(FoodType aFood, String aMenuItem, int aOrderNumber, double aOrderPrice) {
		Food = aFood;
		MenuItem = aMenuItem;
		OrderNumber = aOrderNumber;
		OrderPrice = aOrderPrice;
	}// End of Order constructor
	
	public String toString()
	{
	      // Create a string representing the object.
		String str = String.format("Food Type: %s\nMenu Item: %s\nOrder Number: %s\nPrice: $%,.2f",
	                                 Food, MenuItem, OrderNumber, OrderPrice); 
	      // Return the string.
		return str;
	}
}// End of Order class
