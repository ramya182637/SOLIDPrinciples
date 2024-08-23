package bad.S;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement 
{
	 // Map to store inventory items and their counts
	 private Map<String, Integer> inventory;
	 
	   // Constructor to initialize the inventory as a HashMap
	    public InventoryManagement() 
	    {
	        this.inventory = new HashMap<>();
	    }
	    
	    // Method to add an item to the inventory
	    public void addItem(Item item) 
	    {
	        String itemName = item.getName();
	        // If the item exists then it increases the count; otherwise, adding it with count 1 to map
	        if (inventory.containsKey(itemName)) 
	        {
	            inventory.put(itemName, inventory.get(itemName) + 1);
	        } 
	        else
	        {
	            inventory.put(itemName, 1);
	        }
	        //to display the item added and its count
	        System.out.println("Item added: " + itemName);
	        displayItemCount(itemName);
	    }

	    // Method to delete an item from the inventory
	    public void deleteItem(Item item) 
	    {
	        String itemName = item.getName();
	         // Checks if item exists in inventory
	        if (inventory.containsKey(itemName)) 
	        {
	            int count = inventory.get(itemName);
	            // If count is greater than 0 the decreases count; otherwise, item not found in the map
	            if (count > 0) 
	            {
	                inventory.put(itemName, count - 1);
	                System.out.println("Item deleted: " + itemName);
	                displayItemCount(itemName);
	                //if the count of item is less than 5 then it notifies to re-stock the item
	                if (count <= 5) 
	                {
	                    notifyRestock(item);
	                }
	            }
	            else 
	            {
	                System.out.println("Item not found in inventory: " + itemName);
	            }
	        } 
	        else
	        {
	            System.out.println("Item not found in inventory: " + itemName);
	        }
	    }
	    
	    // Method to notify re-stock needed for an item
	    public void notifyRestock(Item item) 
	    {
	        System.out.println("Restock notification for: " + item.getName());
	    }

	    // Method to display the current count of an item in inventory
	    private void displayItemCount(String itemName) 
	    {
	        int count = inventory.getOrDefault(itemName, 0);
	        System.out.println("Current count of " + itemName + ": " + count);
	    }
}
