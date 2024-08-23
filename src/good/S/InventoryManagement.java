package good.S;

import java.util.HashMap;
import java.util.Map;
public class InventoryManagement
{
	private final Map<String, Integer> inventory;
    private final AddItemService addItemHandler;
    private final DeleteItemService deleteItemHandler;
    private final DisplayItemService displayItemHandler;
    // Constructor to initialize inventory and the services
    public InventoryManagement() 
    {
        this.inventory = new HashMap<>();
        this.addItemHandler = new AddItemService(inventory);
        this.deleteItemHandler = new DeleteItemService(inventory);
        this.displayItemHandler = new DisplayItemService(inventory);
    }
    // Method to add an item using addItemService and display count
    public void addItem(Item item) 
    {
        addItemHandler.addItem(item);
        displayItemHandler.displayItemCount(item.getName());
    }
    // Method to delete an item using deleteItemService
    public void deleteItem(Item item) 
    {
        deleteItemHandler.deleteItem(item);
    }
    // Method to display item count using displayItemService
    public void displayItemCount(String itemName) 
    {
        displayItemHandler.displayItemCount(itemName);
    }
}
