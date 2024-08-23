package good.S;

public class NotificationService
{
	//method to notify if the item count in the inventory is less than 5
	public static void notifyRestock(String itemName)
	{
        System.out.println("Restock notification for: " + itemName);
    }
}
