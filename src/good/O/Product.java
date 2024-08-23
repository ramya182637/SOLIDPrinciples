package good.O;

public class Product
{
	private String name;
    private PricingStrategy pricingStrategy;
    private double price;

    // Constructor
    public Product(String name, PricingStrategy pricingStrategy, double price) {
        this.name = name;
        this.pricingStrategy = pricingStrategy;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate final price
    public double calculateFinalPrice() {
        double discount = pricingStrategy.calculateDiscount(price);
        double HST = pricingStrategy.calculateHST(price);
        double GST = pricingStrategy.calculateGST(price);
        return price - discount + HST + GST;
    }
}
