package good.S;

import java.util.Map;
public class DeleteItemService 
{
	private final Map<String, Integer> inventory;
    public DeleteItemService(Map<String, Integer> inventory) 
    {
        this.inventory = inventory;
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
                DisplayItemService.displayItemCount(itemName);
                //if the count of item is less than 5 then it notifies to re-stock the item
                if (count <= 5) 
                {
                	NotificationService.notifyRestock(itemName);
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
}
