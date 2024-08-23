package good.S;

import java.util.Map;
public class AddItemService 
{
	private final Map<String, Integer> inventory;
    public AddItemService(Map<String, Integer> inventory) 
    {
        this.inventory = inventory;
    }
    // Method to add an item to the inventory
    public void addItem(Item item) 
    {
        String itemName = item.getName();
        // Check if item already exists in inventory and increase count if present,otherwise adding with count 1
        if (inventory.containsKey(itemName)) 
        {
            inventory.put(itemName, inventory.get(itemName) + 1);
        } 
        else 
        {
            inventory.put(itemName, 1);
        }
        System.out.println("Item added: " + itemName);
    }
}
