package good.S;

import java.util.Map;

public class DisplayItemService 
{
	private static Map<String, Integer> inventory;
    public DisplayItemService(Map<String, Integer> inventory) 
    {
        this.inventory = inventory;
    }
    //method to display the item names and their count
    public static void displayItemCount(String itemName) 
    {
        int count = inventory.getOrDefault(itemName, 0);
        System.out.println("Current count of " + itemName + ": " + count);
    }
}
