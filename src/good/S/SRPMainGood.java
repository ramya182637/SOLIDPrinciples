package good.S;

import java.util.Scanner;

import bad.S.InventoryManagement;
import bad.S.Item;

public class SRPMainGood
{
	public static void main(String[] args) 
	{
		 // Creating an instance of InventoryManagement
		 InventoryManagement inventoryManager = new InventoryManagement();
		 //Creating a Scanner object for user input
         Scanner sc = new Scanner(System.in);
         //promping the users to enter the items for inventory management for adding or deleting
         System.out.println("Enter the name of Item : ");
            // Create some sample items
	        Item item1 = new Item(sc.next());
	        Item item2 = new Item(sc.next());
	        Item item3 = new Item(sc.next());
	        // Adding items to the inventory
	        inventoryManager.addItem(item1);
	        inventoryManager.addItem(item2);
	        inventoryManager.addItem(item3);
	        // Deleting the items from the inventory
	        inventoryManager.deleteItem(item1);
	        inventoryManager.deleteItem(item2);
	        inventoryManager.deleteItem(item3); 
	        sc.close();
    }
}
