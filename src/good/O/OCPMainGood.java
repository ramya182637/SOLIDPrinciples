package good.O;

import java.util.Scanner;

public class OCPMainGood 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Available product Types are as Follows : ");
		System.out.println("Electronics\nClothing\nBooks");
		
		System.out.println("Enter the product name and price of product : ");
		Product laptop = new Product(sc.next(),new ElectronicsPricingStrategy(),sc.nextDouble());
		 System.out.println("Product: " + laptop.getName() + ", Final Price: $" + laptop.calculateFinalPrice());
		 
		System.out.println("Enter the product name  and price of product : ");
        Product jeans = new Product(sc.next(),new ClothingPricingStrategy(),sc.nextDouble());
        System.out.println("Product: " + jeans.getName() + ", Final Price: $" + jeans.calculateFinalPrice());
        
        System.out.println("Enter the product name and price of product : ");
        Product novel = new Product(sc.next(),new BooksPricingStrategy(),sc.nextDouble());
        System.out.println("Product: " + novel.getName() + ", Final Price: $" + novel.calculateFinalPrice());
	}
}
