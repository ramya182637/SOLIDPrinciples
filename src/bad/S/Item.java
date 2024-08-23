package bad.S;

public class Item 
{
	// Name of the item
	private String itemName;
	// Count of the item in inventory
	private int count;
	// Constructor to initialize the item with its name and count as 0
	public Item(String itemName)
	{
        this.itemName = itemName;
        this.count = 0;
    }
	//getters and setter for item name and count
	public String getName() 
	{
		return itemName;
	}
	public void setName(String name) 
	{
		this.itemName = name;
	}
	public int getCount() 
	{
		return count;
	}
	public void setCount(int count) 
	{
		this.count = count;
	}
}
