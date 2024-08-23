package good.O;

public class ClothingPricingStrategy implements PricingStrategy 
{
	@Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
    @Override
    public double calculateHST(double price) 
    {
        return price * 0.10;
    }
    @Override
    public double calculateGST(double price) 
    {
        return price * 0.5;
    }
}
