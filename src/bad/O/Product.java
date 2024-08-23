package bad.O;
/**
 * The Product class represents a product with a name, type, and price.
 * Provides methods to calculate discounts, HST, GST and the final price.
 */
public class Product 
{
	private String name;
    private String type;
    private double price;
    /**
     * Constructs a new Product with the specified name, type, and price.
     *
     * @param name  the name of the product
     * @param type  the type of the product (e.g., Electronics, Clothing, Books)
     * @param price the price of the product
     */
    public Product(String name, String type, double price) 
    {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    // Getters and setters
    public String getName()
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getType() 
    {
        return type;
    }
    public void setType(String type) 
    {
        this.type = type;
    }
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
    // Method to calculate discount based on product type
    /**
     * Calculates the discount for the product based on its type.
     * Electronics get a 10% discount, Clothing get a 20% discount, and Books get a 15% discount.
     *
     * @return the discount amount
     */
    public double calculateDiscount() 
    {
        double discount = 0.0;
        if (type.equals("Electronics")) 
        {
            discount = price * 0.1;
        }
        else if (type.equals("Clothing")) 
        {
            discount = price * 0.2;
        }
        else if (type.equals("Books")) 
        {
            discount = price * 0.15;
        }
        return discount;
    }
    // Method to calculate HST based on product type
    /**
     * Calculates the HST (Harmonized Sales Tax) for the product based on its type.
     * Electronics are taxed at 15%, Clothing at 10%, and Books at 5%.
     *
     * @return the HST amount
     */
    public double calculateHST() 
    {
        double tax = 0.0;
        if (type.equals("Electronics")) 
        {
            tax = price * 0.15;
        } 
        else if (type.equals("Clothing"))
        {
            tax = price * 0.10;
        } 
        else if (type.equals("Books")) 
        {
            tax = price * 0.05;
        }
        return tax;
    }
    //method to calculate the GST based on the product type
    /**
     * Calculates the GST (Goods and Services Tax) for the product based on its type.
     * Electronics are taxed at 10%, Clothing at 5%, and Books at 5%.
     *
     * @return the GST amount
     */
    public double calculateGST() 
    {
        double tax = 0.0;
        if (type.equals("Electronics")) 
        {
            tax = price * 0.10;
        } 
        else if (type.equals("Clothing"))
        {
            tax = price * 0.5;
        } 
        else if (type.equals("Books")) 
        {
            tax = price * 0.05;
        }
        return tax;
    }
    /**
     * Calculates the final price of the product, considering the discount, HST, and GST.
     *
     * @return the final price of the product
     */
    // Method to calculate final price
    public double calculateFinalPrice() 
    {
        double discount = calculateDiscount();
        double HST = calculateHST();
        double GST = calculateGST();
        return price - discount + HST + GST;
    }
}
