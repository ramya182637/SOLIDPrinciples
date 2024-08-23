package bad.O;

import java.util.Scanner;

public class OCPMain 
{
	//main method to show the usage of product class
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Printing the available categories of products 
		System.out.println("Available product Types are as Follows : ");
		System.out.println("Electronics\nClothing\nBooks");
		
		//demo of electronics type
		System.out.println("Enter the product name ,product type and price of product : ");
		Product laptop = new Product(sc.next(),sc.next(),sc.nextDouble());
		System.out.println("Product: " + laptop.getName() + ", Final Price: $" + laptop.calculateFinalPrice());
		//demo of clothing type
		System.out.println("Enter the product name ,product type and price : ");
        Product jeans = new Product(sc.next(),sc.next(),sc.nextDouble());
        System.out.println("Product: " + jeans.getName() + ", Final Price: $" + jeans.calculateFinalPrice());
        //demo of books type
        System.out.println("Enter the product name ,product type and price : ");
        Product novel = new Product(sc.next(),sc.next(),sc.nextDouble());
        System.out.println("Product: " + novel.getName() + ", Final Price: $" + novel.calculateFinalPrice());
        sc.close();
	}
}
